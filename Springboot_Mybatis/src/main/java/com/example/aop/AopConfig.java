package com.example.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author cql
 * @create 2021/6/18
 * @since 1.0.0
 */
@Component
@Aspect
@Order(1)
public class AopConfig {
        @Pointcut("execution(* com.example..*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("before:"+joinPoint.getSignature().getName());
    }
}