package com.qiuguan.boot.autoconfigure.log;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author created by qiuguan on 2022/1/11 16:28
 */
@ConfigurationProperties(prefix = "qiuguan.log")
public class LoggingProperties {

    private String prefix;

    private String suffix;


    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
