package com.hjxlog.service;

import java.util.List;

import com.hjxlog.model.Goods;

public interface GoodsService {

    /**
     * 新增.
     *
     * @param goods 实体
     */
    void add(Goods goods);

    /**
     * 修改.
     *
     * @param goods 实体
     */
    void modify(Goods goods);

    /**
     * 删除.
     *
     * @param id
     */
    void remove(Integer id);

    /**
     * 根据主键查询.
     *
     * @param id
     * @return Goods详情信息
     */
    Goods queryByPrimaryKey(Integer id);

    /**
     * 查询所有.
     *
     * @param goods 实体
     * @return goods 信息集合
     */
    List<Goods> queryAll(Goods goods);

}
