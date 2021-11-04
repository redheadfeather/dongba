package com.zl.dongba.dao;


import com.zl.dongba.entity.SysOrders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (SysOrders)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-04 16:25:35
 */
@Repository
@Mapper
public interface SysOrdersDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Select("select count(*) from sys_orders")
    Integer getRowCount();
    SysOrders queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysOrders> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysOrders 实例对象
     * @return 对象列表
     */
    List<SysOrders> queryAll(SysOrders sysOrders);

    /**
     * 新增数据
     *
     * @param sysOrders 实例对象
     * @return 影响行数
     */
    int insert(SysOrders sysOrders);

    /**
     * 修改数据
     *
     * @param sysOrders 实例对象
     * @return 影响行数
     */
    int update(SysOrders sysOrders);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}