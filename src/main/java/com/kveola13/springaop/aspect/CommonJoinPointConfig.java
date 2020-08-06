package com.kveola13.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(*  com.kveola13.springaop.data.*.*(..))")
    public void dataLayerExecution() {

    }

    @Pointcut("execution(*  com.kveola13.springaop.business.*.*(..))")
    public void businessLayerExecution() {

    }
    @Pointcut("com.kveola13.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.kveola13.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void allLayerExecution(){

    }

    @Pointcut("bean(*dao*)")
    public void namedBeanDao(){

    }

    @Pointcut("within(com.kveola13.springaop.data..*)")
    public void dataLayerExecutionWithin() {

    }
}
