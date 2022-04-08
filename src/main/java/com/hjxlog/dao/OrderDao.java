package com.hjxlog.dao;

import com.hjxlog.model.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {

   /**
     * 主键查询.
     * @param id
     * @return 返回Order
     */
   Order selectByPrimaryKey(@Param("id")Long id);

    /**
     * 新增.
     * @param order 实体
     * @return 是否操作成功
     */
    boolean insert(Order order);

    /**
     * 修改.
     * @param order 实体
     * @return 是否操作成功
     */
    boolean update(Order order);

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
    void insertBatch(List<Order> list);

    /**
     * 批量更新.
     * @param list 集合
     */
    void updateBatch(List<Order> list);

    /**
     * 批量删除
     * @param list 集合
     */
    void deleteBatch(List<Order> list);

    /**
     * 查询所有.
     * @param order 实体
     * @return order信息集合
     */
    List<Order> selectAll(Order order);


}
