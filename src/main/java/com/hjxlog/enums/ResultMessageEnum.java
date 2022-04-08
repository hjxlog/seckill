package com.hjxlog.enums;

import com.hjxlog.exception.ResultMessage;

import java.text.MessageFormat;

/**
 * @Author: Huang JX
 * @Date: 2022/04/08
 * @Description: 全局异常枚举信息。
 */
public enum ResultMessageEnum implements ResultMessage {
    SUCCESS("200", "SUCCESS"),
    ERROR("500", "服务端异常"),
    ;

    private String code;

    private String message;

    ResultMessageEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getMessage(Object... args) {
        return MessageFormat.format(this.message, args);
    }
}
