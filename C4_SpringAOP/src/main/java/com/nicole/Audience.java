/**
 * FileName: Audience
 * Author: nicole
 * Date: 2019/6/24 11:22
 * Description:
 */

package com.nicole;/*
 * author: nicole
 * date: 2019/6/24
 * desc:
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


@Aspect
public class Audience {

    //可以在任何切点表达式中使用performance(),避免重复
    @Pointcut("execution(* com.nicole.Performance.perform(..))")
    public void performance(){}

    //使用了重复的切点表达式execution……
    //@Before("execution(* com.nicole.Performance.perform(..))")
    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    //@Before("execution(* com.nicole.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    //@AfterReturning("execution(* com.nicole.Performance.perform(..))")
    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    //@AfterThrowing("execution(* com.nicole.Performance.perform(..))")
    @AfterReturning("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

    @Around("performance()")
    public void watchingPerformance(ProceedingJoinPoint jp){
        System.out.println("Silencing cell phones");
        System.out.println("Taking seats");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
        System.out.println("CLAP CLAP CLAP!!!");
    }
}
