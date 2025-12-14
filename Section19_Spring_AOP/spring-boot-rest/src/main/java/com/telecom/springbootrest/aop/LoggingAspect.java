package com.telecom.springbootrest.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //return type, class Name(full path).method name(args)

    @Before("execution(* com.telecom.springbootrest.service.JobService.getJob(..)) || execution(* com.telecom.springbootrest.service.JobService.getJob(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method called "+jp.getSignature().getName());
    }

    //executes finally after error is thrown also
    @After("execution(* com.telecom.springbootrest.service.JobService.getJob(..)) || execution(* com.telecom.springbootrest.service.JobService.getJob(..))")
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method executed "+jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.telecom.springbootrest.service.JobService.getJob(..)) || execution(* com.telecom.springbootrest.service.JobService.getJob(..))")
    public void logMethodCrashed(JoinPoint jp){
        LOGGER.info("Method has some issues "+jp.getSignature().getName());
    }

    //executes but not when error is thrown
    @AfterReturning("execution(* com.telecom.springbootrest.service.JobService.getJob(..)) || execution(* com.telecom.springbootrest.service.JobService.getJob(..))")
    public void logMethodExecutedSuccess(JoinPoint jp){
        LOGGER.info("Method executed successfully "+jp.getSignature().getName());
    }
}
