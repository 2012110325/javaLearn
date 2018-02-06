package com.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by liqiang28 on 2018/2/6.
 */
@Aspect
@Component
public class Audience {

    @Pointcut("execution(* com.concert.Performance.perform(..))")
    public void performance() {

    }

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }


    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP");
    }


//    @AfterThrowing("execution(** concert.Performance.perform(..))")
    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {

        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP");

        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
    }
}








