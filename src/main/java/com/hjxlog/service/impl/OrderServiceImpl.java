package com.hjxlog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hjxlog.model.Order;
import com.hjxlog.dao.OrderDao;
import com.hjxlog.service.OrderService;


@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    protected OrderDao orderDao;

    @Override
    @Transactional
    public void add(Order order) {
        orderDao.insert(order);
    }

    @Override
    @Transactional
    public void modify(Order order) {
        orderDao.update(order);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        orderDao.delete(id);
    }

    @Override
    public Order queryByPrimaryKey(Long id) {
        return orderDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Order> queryAll(Order order) {
        return orderDao.selectAll(order);
    }

}
