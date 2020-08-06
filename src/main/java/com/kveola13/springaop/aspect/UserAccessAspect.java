package com.kveola13.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(*  com.kveola13.springaop.data.*.*(..))")
    public void before(JoinPoint joinPoint) {
        logger.info("Check for user access");
        logger.info("Intercepted Method call {}", joinPoint);
    }

}
