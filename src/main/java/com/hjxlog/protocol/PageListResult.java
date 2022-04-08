package com.hjxlog.protocol;

import com.hjxlog.protocol.page.PageBody;

import java.util.List;

/**
 * @Author: Huang JX
 * @Date: 2022/04/08
 * @Description: 分页返回
 */
public class PageListResult<T> extends Result<PageBody<T>> {

    public PageListResult() {
        super.setBody(new PageBody());
    }

    public PageListResult(List<T> list) {
        super(new PageBody(list));
    }

    public void setPageList(List<T> list) {
        super.setBody(new PageBody(list));
    }
}
