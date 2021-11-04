package com.zl.dongba.service;


import com.zl.dongba.entity.SysOrders;
import com.zl.dongba.vo.PagedResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (SysOrders)表服务接口
 *
 * @author makejava
 * @since 2021-11-04 16:25:39
 */
public interface SysOrdersService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysOrders queryById(String id);

    /**
     * 查询多条数据
     *
     * @param pageCurrent 查询的当前页
     * @param pageSize 查询的条数
     * @return 对象列表
     */
    PagedResult<SysOrders> queryAllByLimit(Integer pageCurrent, Integer pageSize);

    /**
     * 新增数据
     *
     * @param sysOrders 实例对象
     * @return 实例对象
     */
    int insert(SysOrders sysOrders);

    /**
     * 修改数据
     *
     * @param sysOrders 实例对象
     * @return 实例对象
     */
    int update(SysOrders sysOrders);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}