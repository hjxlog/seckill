package com.hjxlog.dao;

import com.hjxlog.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

   /**
     * 主键查询.
     * @param id
     * @return 返回User
     */
   User selectByPrimaryKey(@Param("id")Long id);

    /**
     * 新增.
     * @param user 实体
     * @return 是否操作成功
     */
    boolean insert(User user);

    /**
     * 修改.
     * @param user 实体
     * @return 是否操作成功
     */
    boolean update(User user);

    /**
     * 根据主键删除.
     * @param id
     * @return 是否操作成功
     */
    boolean delete(@Param("id")Long id);

    /**
     * 批量插入.
     * @param list 集合
     */
    void insertBatch(List<User> list);

    /**
     * 批量更新.
     * @param list 集合
     */
    void updateBatch(List<User> list);

    /**
     * 批量删除
     * @param list 集合
     */
    void deleteBatch(List<User> list);

    /**
     * 查询所有.
     * @param user 实体
     * @return user信息集合
     */
    List<User> selectAll(User user);

}
