package com.hjxlog.protocol.page;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Huang JX
 * @Date: 2022/04/08
 * @Description: 分页返回体
 */
public class PageBody<T> {

    private long total = 0L;

    private List<T> data = new ArrayList<>();

    public PageBody() {
    }

    public PageBody(List<T> list) {
        if (list instanceof PageList) {
            PageList pageList = (PageList) list;
            this.total = pageList.getTotal();
            this.data = pageList;
        } else {
            this.total = (long) list.size();
            this.data = list;
        }
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
