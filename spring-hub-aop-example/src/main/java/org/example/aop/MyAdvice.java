package org.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class MyAdvice {

    @Pointcut("execution(* org.example.service.*Service.*(..))")
    private void calcDurationPoint() {
    }

    @Around("calcDurationPoint()")
    public Object calcDuration(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        log.info("{}.{} , execute cost: {}ms", pjp.getSignature().getDeclaringTypeName(), pjp.getSignature().getName(), System.currentTimeMillis() - start);
        return obj;
    }

}
