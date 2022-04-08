package com.hjxlog.dao;

import com.hjxlog.model.SeckillGoods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeckillGoodsDao {

   /**
     * 主键查询.
     * @param id
     * @return 返回SeckillGoods
     */
   SeckillGoods selectByPrimaryKey(@Param("id")Long id);

    /**
     * 新增.
     * @param seckillGoods 实体
     * @return 是否操作成功
     */
    boolean insert(SeckillGoods seckillGoods);

    /**
     * 修改.
     * @param seckillGoods 实体
     * @return 是否操作成功
     */
    boolean update(SeckillGoods seckillGoods);

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
    void insertBatch(List<SeckillGoods> list);

    /**
     * 批量更新.
     * @param list 集合
     */
    void updateBatch(List<SeckillGoods> list);

    /**
     * 批量删除
     * @param list 集合
     */
    void deleteBatch(List<SeckillGoods> list);

    /**
     * 查询所有.
     * @param seckillGoods 实体
     * @return seckillGoods信息集合
     */
    List<SeckillGoods> selectAll(SeckillGoods seckillGoods);

}
