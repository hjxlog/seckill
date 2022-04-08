package com.hjxlog.exception;

import com.hjxlog.enums.ResultMessageEnum;
import com.hjxlog.protocol.Result;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: Huang JX
 * @Date: 2022/04/08
 * @Description: 异常处理类
 */
@RestControllerAdvice
@Log4j2
public class GlobalExceptionHandler {

    @ExceptionHandler
    public Result exceptionHandler(Exception ex) {
        if (ex instanceof BaseRuntimeException) {
            BaseRuntimeException exception = (BaseRuntimeException) ex;
            ResultMessage resultMessage = exception.getResultMessage();
            log.info("异常信息：{}", resultMessage.getMessage());
            return new Result(resultMessage);
        }
        log.info("异常信息" + ex.getMessage());
        return Result.error(ResultMessageEnum.ERROR);
    }

}
