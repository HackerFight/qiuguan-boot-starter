package com.qiuguan.boot.test;

import com.qiuguan.boot.autoconfigure.date.EnableDateUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author created by qiuguan on 2022/1/11 11:45
 */
@EnableDateUtil
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
