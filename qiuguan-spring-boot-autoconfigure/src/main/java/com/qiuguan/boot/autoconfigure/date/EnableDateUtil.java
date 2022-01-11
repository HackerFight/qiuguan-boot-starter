package com.qiuguan.boot.autoconfigure.date;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: qiuguan
 * date: 2022/1/12 - 上午12:52
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MyImport.class)
public @interface EnableDateUtil {

}
