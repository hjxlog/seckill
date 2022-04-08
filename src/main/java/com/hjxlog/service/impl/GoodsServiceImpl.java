package com.hjxlog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hjxlog.model.Goods;

import com.hjxlog.dao.GoodsDao;
import com.hjxlog.service.GoodsService;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    protected GoodsDao goodsDao;

    @Override
    @Transactional
    public void add(Goods goods) {
        goodsDao.insert(goods);
    }

    @Override
    @Transactional
    public void modify(Goods goods) {
        goodsDao.update(goods);
    }

    @Override
    @Transactional
    public void remove(Integer id) {
        goodsDao.delete(id);
    }

    @Override
    public Goods queryByPrimaryKey(Integer id) {
        return goodsDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Goods> queryAll(Goods goods) {
        return goodsDao.selectAll(goods);
    }


}
