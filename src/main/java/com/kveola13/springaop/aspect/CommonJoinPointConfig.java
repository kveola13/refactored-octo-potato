package com.kveola13.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(*  com.kveola13.springaop..*.*(..))")
    public void dataLayerExecution() {

    }
}
