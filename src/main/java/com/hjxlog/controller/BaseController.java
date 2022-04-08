package com.hjxlog.controller;

import com.hjxlog.exception.BaseRuntimeException;
import com.hjxlog.enums.ResultMessageEnum;
import com.hjxlog.protocol.PageListResult;
import com.hjxlog.protocol.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Huang JX
 * @Date: 2022/04/08
 * @Description:
 */
@RestController
@RequestMapping("/base")
public class BaseController {

    @RequestMapping("/get-default")
    public Result getResult() {
        return new Result();
    }

    @RequestMapping("/get-success")
    public Result getSuccess() {
        Result result = new Result();
        return result.success("接口返回成功");
    }

    @RequestMapping("/get-error")
    public Result getError() {
        Result result = new Result();
        return result.error("接口返回失败");
    }

    @RequestMapping("/get-body")
    public Result<String> getBody() {
        Result<String> result = new Result();
        result.setBody("hello world!");
        return result;
    }

    @RequestMapping("/get-page-list")
    public PageListResult<String> getPageList() {
        List list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        return new PageListResult<>(list);
    }

    @RequestMapping("/get-exception")
    public void getException() {
        throw new BaseRuntimeException(ResultMessageEnum.ERROR);
    }

}
