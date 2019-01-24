package com.kaikeba.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: Alex
 * @date: 2019/1/24 17:28
 * description: Java configuration编程方式的aspectJ的一个切面
 */
@Component
@Aspect
public class AspectJ {

    /**
     * 可以细粒度到方法
     */
    @Pointcut("execution(* com.kaikeba.service.*.*(..))")
    public void pointCutExecution(){}

    /**
     * 可以细粒度到类
     */
    @Pointcut("within(com.kaikeba.service.*)")
    public void pointCutWithin(){}

    @Before("pointCutExecution()")
    public void before(){
        System.out.println("before");
    }
}
