package io.github.aoptest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Improve {

    @Before(value = "execution(* io.github.aoptest.UserProxy.add(..))")
    public void before() {
        System.out.println("before...");
    }

    //最终通知
    @After(value = "execution(* io.github.aoptest.UserProxy.add(..))")
    public void after() {
        System.out.println("after...");
    }

    @AfterReturning(value = "execution(* io.github.aoptest.UserProxy.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning...");
    }

    @AfterThrowing(value = "execution(* io.github.aoptest.UserProxy.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }

    @Around(value = "execution(* io.github.aoptest.UserProxy.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before...");
        proceedingJoinPoint.proceed();
        System.out.println("arount after...");
    }
}
