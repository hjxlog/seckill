package com.hjxlog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hjxlog.model.User;
import com.hjxlog.dao.UserDao;
import com.hjxlog.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    protected UserDao userDao;

    @Override
    @Transactional
    public void add(User user) {
        userDao.insert(user);
    }

    @Override
    @Transactional
    public void modify(User user) {
        userDao.update(user);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        userDao.delete(id);
    }

    @Override
    public User queryByPrimaryKey(Long id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public List<User> queryAll(User user) {
        return userDao.selectAll(user);
    }

}
