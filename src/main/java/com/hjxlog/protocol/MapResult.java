package com.hjxlog.protocol;

import com.hjxlog.exception.ResultMessage;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Huang JX
 * @Date: 2022/04/08
 * @Description: map结果集.
 */
public class MapResult<K, V> extends Result<Map<K, V>> {

    public MapResult() {
        super();
        super.setBody(new HashMap<>());
    }

    public MapResult(Map<K, V> map) {
        super(map);
    }

    public MapResult(ResultMessage message) {
        super(message);
    }

    public MapResult(ResultMessage message, Object... args) {
        super(message, args);
    }
}
