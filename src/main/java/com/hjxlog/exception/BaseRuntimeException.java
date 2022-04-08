package com.hjxlog.exception;


/**
 * @Author: Huang JX
 * @Date: 2022/04/08
 * @Description: 运行时异常基类.
 */
public class BaseRuntimeException extends RuntimeException {

    private ResultMessage resultMessage;

    public BaseRuntimeException(ResultMessage message) {
        this.resultMessage = message;
    }

    public ResultMessage getResultMessage() {
        return resultMessage;
    }

}
