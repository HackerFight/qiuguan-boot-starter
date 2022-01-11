package com.qiuguan.boot.autoconfigure.log;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author created by qiuguan on 2022/1/11 11:56
 */
@EnableConfigurationProperties(LoggingProperties.class)
@Configuration
public class LoggingAutoConfiguration {

    @Bean
    public LoggingAspect loggingAspect(LoggingProperties loggingProperties){
        return new LoggingAspect(loggingProperties);
    }
}
