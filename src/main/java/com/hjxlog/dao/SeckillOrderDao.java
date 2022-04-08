package com.hjxlog.dao;

import com.hjxlog.model.SeckillOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeckillOrderDao {

   /**
     * 主键查询.
     * @param id
     * @return 返回SeckillOrder
     */
   SeckillOrder selectByPrimaryKey(@Param("id")Long id);

    /**
     * 新增.
     * @param seckillOrder 实体
     * @return 是否操作成功
     */
    boolean insert(SeckillOrder seckillOrder);

    /**
     * 修改.
     * @param seckillOrder 实体
     * @return 是否操作成功
     */
    boolean update(SeckillOrder seckillOrder);

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
    void insertBatch(List<SeckillOrder> list);

    /**
     * 批量更新.
     * @param list 集合
     */
    void updateBatch(List<SeckillOrder> list);

    /**
     * 批量删除
     * @param list 集合
     */
    void deleteBatch(List<SeckillOrder> list);

    /**
     * 查询所有.
     * @param seckillOrder 实体
     * @return seckillOrder信息集合
     */
    List<SeckillOrder> selectAll(SeckillOrder seckillOrder);

}
