package com.qiuguan.boot.autoconfigure.date;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @author: qiuguan
 * date: 2022/1/11 - 下午10:16
 *
 * 时区转换自动配置类
 */

@EnableConfigurationProperties(DateProperties.class)
@Configuration
public class DateAutoConfiguration {

    @Bean
    public DateBeanUtil dateBeanUtil(){
        return new DateBeanUtil();
    }

    @Bean
    public FilterRegistrationBean<Filter> registerFilter(){
        FilterRegistrationBean<Filter> register = new FilterRegistrationBean<>();
        register.setFilter(new MyFilter());
        register.addUrlPatterns("/*");
        register.setName("logCostFilter");
        register.setOrder(1);
        return register;
    }


}
