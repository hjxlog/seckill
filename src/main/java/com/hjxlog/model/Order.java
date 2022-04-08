/*
 * <p>文件名称: Order.java</p>
 * <p>项目描述: KOCA 金证云原生平台 V1.0.0</p>
 * <p>公司名称: 深圳市金证科技股份有限公司</p>
 * <p>版权所有: 版权所有(C)2019-2020</p>
 */

package com.hjxlog.model;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 *
 * 对应表：order.
 * 订单表
 * @author tool
 * @version 1.0.0, 2022/04/08
 * @since 1.0.0
 */
public class Order  {
    /**
     * 订单ID。
     */
    private Long id;

    /**
     * 用户ID。
     */
    private Long userId;

    /**
     * 商品ID。
     */
    private Long goodsId;

    /**
     * 商品名字。
     */
    private String goodsName;

    /**
     * 商品数量。
     */
    private Integer goodsCount;

    /**
     * 商品价格。
     */
    private BigDecimal goodsPrice;

    /**
     * 订单状态，0新建未支付，1已支付，2已发货，3已收货，4已退货，5已完成。
     */
    private Integer status;

    /**
     * 订单创建时间。
     */
    private Timestamp createDate;

    /**
     * 支付时间。
     */
    private Timestamp payDate;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId(){
        return this.userId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getGoodsId(){
        return this.goodsId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsName(){
        return this.goodsName;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Integer getGoodsCount(){
        return this.goodsCount;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getGoodsPrice(){
        return this.goodsPrice;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus(){
        return this.status;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getCreateDate(){
        return this.createDate;
    }

    public void setPayDate(Timestamp payDate) {
        this.payDate = payDate;
    }

    public Timestamp getPayDate(){
        return this.payDate;
    }

}
