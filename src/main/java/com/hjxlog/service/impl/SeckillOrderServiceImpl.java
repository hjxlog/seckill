package com.hjxlog.service.impl;

import com.hjxlog.dao.SeckillOrderDao;
import com.hjxlog.model.SeckillOrder;
import com.hjxlog.service.SeckillOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("seckillOrderService")
public class SeckillOrderServiceImpl implements SeckillOrderService {

    @Autowired
    protected SeckillOrderDao seckillOrderDao;

    @Override
    @Transactional
    public void add(SeckillOrder seckillOrder) {
        seckillOrderDao.insert(seckillOrder);
    }

    @Override
    @Transactional
    public void modify(SeckillOrder seckillOrder) {
        seckillOrderDao.update(seckillOrder);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        seckillOrderDao.delete(id);
    }

    @Override
    public SeckillOrder queryByPrimaryKey(Long id) {
        return seckillOrderDao.selectByPrimaryKey(id);
    }

    @Override
    public List<SeckillOrder> queryAll(SeckillOrder seckillOrder) {
        return seckillOrderDao.selectAll(seckillOrder);
    }

}
