package com.zl.dongba.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * (SysOrders)实体类
 *
 * @author makejava
 * @since 2021-11-04 16:18:49
 */
@Data
@Accessors(chain = true)
public class SysOrders implements Serializable {
    private static final long serialVersionUID = -53050677907741140L;
    /**
    * 订单号
    */
    private String id;
    /**
    * 订单名称
    */
    private String name;
    /**
    * 价格
    */
    private String price;
    /**
    * 数量
    */
    private Integer number;
    /**
    * 客户
    */
    private String customer;
    /**
    * 销售员id
    */
    private Integer userId;
    /**
    * 创建时间
    */
    private Object createdTime;
    /**
    * 修改时间
    */
    private Object modifiedTime;
    /**
    * 创建人
    */
    private String createdUser;
    /**
    * 修改人
    */
    private String modifiedUser;




}