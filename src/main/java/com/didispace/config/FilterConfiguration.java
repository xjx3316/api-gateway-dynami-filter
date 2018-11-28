package com.didispace.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by xjx on 2018/11/28.
 */
@ConfigurationProperties("zuul.filter")
public class FilterConfiguration {
    private String root;
    private Integer interval;

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }
}
