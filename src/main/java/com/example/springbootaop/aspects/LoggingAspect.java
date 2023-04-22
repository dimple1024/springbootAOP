package com.example.springbootaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


    // Advice is before and in it's argument it specifies the pointcut
    @Before("execution(* com.example.springbootaop.aopTarget.AopTarget.targetMethod())")
    public void beforeLogging(JoinPoint jp) {
        System.out.println("Starting execution of method:" + jp.getSignature().getName());
    }

    @Pointcut(value = "within(com.example.springbootaop.aopTarget.AopTarget)")
    public void allMethodsInsideAopTarget() {
    }

    @After("allMethodsInsideAopTarget()")
    public void afterLogging(JoinPoint jp) {
        System.out.println("Execution of method: " + jp.getSignature().getName() + " completed.");
    }
}
