package com.qiuguan.boot.autoconfigure.date;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: qiuguan
 * date: 2022/1/11 - 下午10:18
 */
@ConfigurationProperties(prefix = "qiuguan.date")
public class DateProperties {

    private Double latitude = 120d;

    private int zone;

    private String pattern = "yyyy-MM-dd hh:mm:ss";

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
