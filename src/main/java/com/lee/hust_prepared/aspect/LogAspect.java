package com.lee.hust_prepared.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/13 21:56
 * @desc
 **/
@Aspect
@Component
public class LogAspect {
    public static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Before("execution(* com.lee.hust_prepared.controller.*Controller.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        StringBuilder sb = new StringBuilder();
        for (Object args : joinPoint.getArgs()) {
            sb.append("args:" + args.toString() + "|");
        }
        logger.info("before method:" + sb.toString());
    }

    @After("execution(* com.lee.hust_prepared.controller.Control.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        logger.info("after method: ");
    }

}
