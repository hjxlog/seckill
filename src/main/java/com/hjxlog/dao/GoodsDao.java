package com.hjxlog.dao;

import com.hjxlog.model.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {

    /**
     * 主键查询.
     *
     * @param id
     * @return 返回Goods
     */
    Goods selectByPrimaryKey(@Param("id") Integer id);

    /**
     * 新增.
     *
     * @param goods 实体
     * @return 是否操作成功
     */
    boolean insert(Goods goods);

    /**
     * 修改.
     *
     * @param goods 实体
     * @return 是否操作成功
     */
    boolean update(Goods goods);

    /**
     * 根据主键删除.
     *
     * @param id
     * @return 是否操作成功
     */
    boolean delete(@Param("id") Integer id);

    /**
     * 批量插入.
     *
     * @param list 集合
     */
    void insertBatch(List<Goods> list);

    /**
     * 批量更新.
     *
     * @param list 集合
     */
    void updateBatch(List<Goods> list);

    /**
     * 批量删除
     *
     * @param list 集合
     */
    void deleteBatch(List<Goods> list);

    /**
     * 查询所有.
     *
     * @param goods 实体
     * @return goods信息集合
     */
    List<Goods> selectAll(Goods goods);

}
