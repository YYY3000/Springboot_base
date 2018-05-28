package com.mastercom.commqry.po;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author yinyiyun
 * @date 2018/5/28 13:27
 */
@Component
@ConfigurationProperties(prefix = "configuration")
public class ConfigPO {

    private Integer count;

    private List<Map<String, String>> connections = new ArrayList<>();

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Map<String, String>> getConnections() {
        return connections;
    }

    public void setConnections(List<Map<String, String>> connections) {
        this.connections = connections;
    }
}
