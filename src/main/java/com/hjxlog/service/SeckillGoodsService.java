package com.hjxlog.service;

import java.util.List;

import com.hjxlog.model.SeckillGoods;

public interface SeckillGoodsService {

    /**
     * 新增.
     *
     * @param seckillGoods 实体
     */
    void add(SeckillGoods seckillGoods);

    /**
     * 修改.
     *
     * @param seckillGoods 实体
     */
    void modify(SeckillGoods seckillGoods);

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
     * @return SeckillGoods详情信息
     */
    SeckillGoods queryByPrimaryKey(Long id);

    /**
     * 查询所有.
     *
     * @param seckillGoods 实体
     * @return seckillGoods 信息集合
     */
    List<SeckillGoods> queryAll(SeckillGoods seckillGoods);

}
