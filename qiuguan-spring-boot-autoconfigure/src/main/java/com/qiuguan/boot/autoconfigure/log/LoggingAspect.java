package com.qiuguan.boot.autoconfigure.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author created by qiuguan on 2022/1/11 16:33
 */
@Aspect
public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    private LoggingProperties properties;

    public LoggingAspect(LoggingProperties properties) {
        this.properties = properties;
    }

    /**
     * {@link https://blog.csdn.net/u013378306/article/details/86668304 }
     */
    @Pointcut("@annotation(com.qiuguan.boot.autoconfigure.log.Logging)")
    public void logAnnotationPointcut(){}


    @Around(value = "logAnnotationPointcut()")
    public Object logInvoke(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("prefix config: {} ; suffix config: {}", properties.getPrefix(), properties.getSuffix());

        logger.info("请求参数: {}", Arrays.asList(joinPoint.getArgs()));

        Object proceed = joinPoint.proceed();

        logger.info("请求结果：{}", proceed);

        return proceed;
    }

}
