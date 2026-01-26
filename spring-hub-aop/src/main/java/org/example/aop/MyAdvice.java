package org.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class MyAdvice {

    @Pointcut("execution(* org.example.service.TextEditorService.*())")
    private void myPointCut() {
    }

    // @Before("myPointCut()")
    public void before() {
        log.info("Before advice running.");
    }

    // @After("myPointCut()")
    public void after() {
        log.info("After advice running.");
    }

    @Around("myPointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        log.info("Around - Before advice running.");
        Object obj = pjp.proceed();
        log.info("Around - After advice running.");
        return obj;
    }

    @AfterReturning("myPointCut()")
    public void afterReturning() {
        log.info("after returning.");
    }

}
