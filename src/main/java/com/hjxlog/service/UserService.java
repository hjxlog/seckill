package com.hjxlog.service;

import java.util.List;

import com.hjxlog.model.User;

public interface UserService {

    /**
     * 新增.
     *
     * @param user 实体
     */
    void add(User user);

    /**
     * 修改.
     *
     * @param user 实体
     */
    void modify(User user);

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
     * @return User详情信息
     */
    User queryByPrimaryKey(Long id);

    /**
     * 查询所有.
     *
     * @param user 实体
     * @return user 信息集合
     */
    List<User> queryAll(User user);

}
