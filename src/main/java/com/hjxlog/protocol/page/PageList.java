package com.hjxlog.protocol.page;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: Huang JX
 * @Date: 2022/04/08
 * @Description:
 */
public class PageList<T> extends ArrayList<T> {

    private long total;

    public PageList() {

    }

    public PageList(Collection<? extends T> list) {
        super(list);
    }

    public PageList(Collection<? extends T> list, long total) {
        super(list);
        this.total = total;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
