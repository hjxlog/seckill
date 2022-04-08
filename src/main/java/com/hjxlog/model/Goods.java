/*
 * <p>文件名称: Goods.java</p>
 * <p>项目描述: KOCA 金证云原生平台 V1.0.0</p>
 * <p>公司名称: 深圳市金证科技股份有限公司</p>
 * <p>版权所有: 版权所有(C)2019-2020</p>
 */

package com.hjxlog.model;

import java.math.BigDecimal;


/**
 *
 * 对应表：goods.
 * 商品表
 * @author tool
 * @version 1.0.0, 2022/04/08
 * @since 1.0.0
 */
public class Goods  {
    /**
     * 商品ID。
     */
    private Integer id;

    /**
     * 商品名称。
     */
    private String name;

    /**
     * 商品标题。
     */
    private String title;

    /**
     * 商品图片。
     */
    private String img;

    /**
     * 商品价格。
     */
    private BigDecimal price;

    /**
     * 商品库存。
     */
    private Integer stock;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg(){
        return this.img;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice(){
        return this.price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStock(){
        return this.stock;
    }

}
