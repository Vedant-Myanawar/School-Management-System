package com.eazybytes.eazyschool.aspects;


import com.eazybytes.eazyschool.controller.ContactController;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Aspect
@Component
public class LoggerAspect {

    private static Logger log = LoggerFactory.getLogger(LoggerAspect.class);

    @Around("execution(*com.eazybytes.eazyschool..*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info(joinPoint.getSignature().toString() + "method execution start");
        Instant start = Instant.now();
        Object returnObj = joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        log.info("Time took to execute " + joinPoint.getSignature().toString() + "method is : "+timeElapsed);
        log.info(joinPoint.getSignature().toString() + "method executionn end");
        return returnObj;
    }

    @AfterThrowing(value = "execution(* com.eazybytes.eazyschool.*.*(..))",throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex) {
        log.error(joinPoint.getSignature()+ "An Exception happened due to : "+ex.getMessage());
    }


}
