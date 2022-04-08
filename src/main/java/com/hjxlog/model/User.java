/*
 * <p>文件名称: User.java</p>
 * <p>项目描述: KOCA 金证云原生平台 V1.0.0</p>
 * <p>公司名称: 深圳市金证科技股份有限公司</p>
 * <p>版权所有: 版权所有(C)2019-2020</p>
 */

package com.hjxlog.model;



/**
 *
 * 对应表：user.
 * 用户表
 * @author tool
 * @version 1.0.0, 2022/04/08
 * @since 1.0.0
 */
public class User  {
    /**
     * 用户ID,手机号码。
     */
    private Long id;

    /**
     * 。
     */
    private String username;

    /**
     * 。
     */
    private String password;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

}
