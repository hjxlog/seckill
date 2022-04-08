/*
 * <p>文件名称: SeckillOrder.java</p>
 * <p>项目描述: KOCA 金证云原生平台 V1.0.0</p>
 * <p>公司名称: 深圳市金证科技股份有限公司</p>
 * <p>版权所有: 版权所有(C)2019-2020</p>
 */

package com.hjxlog.model;



/**
 *
 * 对应表：seckill_order.
 * 秒杀订单表
 * @author tool
 * @version 1.0.0, 2022/04/08
 * @since 1.0.0
 */
public class SeckillOrder  {
    /**
     * 秒杀订单ID。
     */
    private Long id;

    /**
     * 用户ID。
     */
    private Long userId;

    /**
     * 订单ID。
     */
    private Long orderId;

    /**
     * 商品ID。
     */
    private Long goodsId;

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

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId(){
        return this.orderId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getGoodsId(){
        return this.goodsId;
    }

}
