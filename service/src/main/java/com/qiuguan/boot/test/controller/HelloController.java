package com.qiuguan.boot.test.controller;

import com.qiuguan.boot.autoconfigure.date.DateBeanUtil;
import com.qiuguan.boot.autoconfigure.log.Logging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author created by qiuguan on 2022/1/11 17:20
 */
@RestController
public class HelloController {

    @Autowired
    private DateBeanUtil dateBeanUtil;

    /**
     * 业务类只需要标注这个注解即可
     *
     */
    @Logging
    @GetMapping("/helloLog/{name}/{id}")
    public String helloLog(@PathVariable String name, @PathVariable Long id){
        return "Hello " + name + ", your id is : " + id;
    }

    @GetMapping("/date")
    public String helloDate(){
        return dateBeanUtil.getTime();
    }
}
