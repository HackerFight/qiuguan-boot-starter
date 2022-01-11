package com.qiuguan.boot.autoconfigure.date;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: qiuguan
 * date: 2022/1/11 - 下午10:44
 */
public class DateBeanUtil {

    @Autowired
    private DateProperties dateProperties;

    public String getTime(){
        int zone = 8;
        if(dateProperties.getLatitude() != null) {
            zone = (int)Math.round((dateProperties.getLatitude() * DateTimeConstants.HOURS_PER_DAY) / 360 );
        }

        DateTimeZone dateTimeZone = DateTimeZone.forOffsetHours(zone);
        return new DateTime(dateTimeZone).toString(dateProperties.getPattern());
    }
}
