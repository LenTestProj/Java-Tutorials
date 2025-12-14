package com.telecom.springbootrest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect {
    public static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitorAspect.class);
    
    @Around("execution(* com.telecom.springbootrest.service.JobService.getJob(..)))")
    public Object monitorTime(ProceedingJoinPoint jp) throws Throwable{
        long start = System.currentTimeMillis();

        Object obj = jp.proceed();
        
        long end = System.currentTimeMillis();

        LOGGER.info("Time taken "+(end-start)+"milliseconds");
        // LOGGER.info(obj.toString());

        return obj;
    }
}
