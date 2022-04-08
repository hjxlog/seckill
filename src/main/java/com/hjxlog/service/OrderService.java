package com.hjxlog.service;

import java.util.List;

import com.hjxlog.model.Order;

public interface OrderService {

    /**
     * 新增.
     *
     * @param order 实体
     */
    void add(Order order);

    /**
     * 修改.
     *
     * @param order 实体
     */
    void modify(Order order);

    /**
     * 删除.
     *
     * @param id
     */
    void remove(Long id);

    /**
     * 根据主键查询.
     *
     * @param id
     * @return Order详情信息
     */
    Order queryByPrimaryKey(Long id);

    /**
     * 查询所有.
     *
     * @param order 实体
     * @return order 信息集合
     */
    List<Order> queryAll(Order order);

}
