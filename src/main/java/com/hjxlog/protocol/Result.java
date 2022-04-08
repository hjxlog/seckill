package com.hjxlog.protocol;

import com.hjxlog.exception.ResultMessage;

/**
 * @Author: Huang JX
 * @Date: 2022/04/08
 * @Description: 统一返回对象
 */
public class Result<T> {

    /**
     * 返回代码
     */
    private String code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 返回数据体
     */
    private T body;

    public Result() {
        this.code = "0";
        this.msg = "请求处理成功";
    }

    public Result(T body) {
        this();
        this.body = body;
    }

    public Result(ResultMessage message) {
        this.setCode(message.getCode());
        this.setMsg(message.getMessage());
    }

    public Result(ResultMessage message, Object... args) {
        this.setCode(message.getCode());
        this.setMsg(message.getMessage(args));
    }

    public static <T> Result success(String msg, T body) {
        Result<T> result = new Result();
        result.setCode("0");
        result.setMsg(msg);
        result.setBody(body);
        return result;
    }

    public static <T> Result success(String msg) {
        return success(msg, null);
    }

    public static <T> Result<T> error(String msg, T body) {
        Result<T> result = new Result();
        result.setCode("500");
        result.setMsg(msg);
        result.setBody(body);
        return result;
    }

    public static <T> Result<T> error(String msg) {

        return error(msg, null);
    }

    public static <T> Result<T> error(ResultMessage message) {
        return error(message.getMessage(), null);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
