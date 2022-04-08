package com.hjxlog.service;

import java.util.List;

import com.hjxlog.model.SeckillOrder;

public interface SeckillOrderService {

    /**
     * 新增.
     *
     * @param seckillOrder 实体
     */
    void add(SeckillOrder seckillOrder);

    /**
     * 修改.
     *
     * @param seckillOrder 实体
     */
    void modify(SeckillOrder seckillOrder);

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
     * @return SeckillOrder详情信息
     */
    SeckillOrder queryByPrimaryKey(Long id);

    /**
     * 查询所有.
     *
     * @param seckillOrder 实体
     * @return seckillOrder 信息集合
     */
    List<SeckillOrder> queryAll(SeckillOrder seckillOrder);

}
