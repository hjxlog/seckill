package com.hjxlog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hjxlog.model.SeckillGoods;

import com.hjxlog.dao.SeckillGoodsDao;
import com.hjxlog.service.SeckillGoodsService;

@Service("seckillGoodsService")
public class SeckillGoodsServiceImpl implements SeckillGoodsService {

    @Autowired
    protected SeckillGoodsDao seckillGoodsDao;

    @Override
    @Transactional
    public void add(SeckillGoods seckillGoods) {
        seckillGoodsDao.insert(seckillGoods);
    }

    @Override
    @Transactional
    public void modify(SeckillGoods seckillGoods) {
        seckillGoodsDao.update(seckillGoods);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        seckillGoodsDao.delete(id);
    }

    @Override
    public SeckillGoods queryByPrimaryKey(Long id) {
        return seckillGoodsDao.selectByPrimaryKey(id);
    }

    @Override
    public List<SeckillGoods> queryAll(SeckillGoods seckillGoods) {
        return seckillGoodsDao.selectAll(seckillGoods);
    }


}
