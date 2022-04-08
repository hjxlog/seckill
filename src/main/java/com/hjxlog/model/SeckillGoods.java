/*
 * <p>文件名称: SeckillGoods.java</p>
 * <p>项目描述: KOCA 金证云原生平台 V1.0.0</p>
 * <p>公司名称: 深圳市金证科技股份有限公司</p>
 * <p>版权所有: 版权所有(C)2019-2020</p>
 */

package com.hjxlog.model;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 *
 * 对应表：seckill_goods.
 * 秒杀商品表
 * @author tool
 * @version 1.0.0, 2022/04/08
 * @since 1.0.0
 */
public class SeckillGoods  {
    /**
     * 秒杀商品ID。
     */
    private Long id;

    /**
     * 商品ID。
     */
    private Long goodsId;

    /**
     * 秒杀家。
     */
    private BigDecimal seckillPrice;

    /**
     * 库存数量。
     */
    private Integer stockCount;

    /**
     * 秒杀开始时间。
     */
    private Timestamp startDate;

    /**
     * 秒杀结束时间。
     */
    private Timestamp endDate;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getGoodsId(){
        return this.goodsId;
    }

    public void setSeckillPrice(BigDecimal seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public BigDecimal getSeckillPrice(){
        return this.seckillPrice;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getStockCount(){
        return this.stockCount;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getStartDate(){
        return this.startDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Timestamp getEndDate(){
        return this.endDate;
    }

}
