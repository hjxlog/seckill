package com.hjxlog.exception;

/**
 * 异常信息基础接口.
 */
public interface ResultMessage {

    String getCode();

    String getMessage();

    String getMessage(Object... args);

}
