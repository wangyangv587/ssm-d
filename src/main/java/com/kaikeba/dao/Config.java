package com.kaikeba.dao;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = {"com.kaikeba.dao","com.kaikeba.aop"})
@EnableAspectJAutoProxy(proxyTargetClass = false) //启用aspectj注解，proxyTargetClass表示是否启用cglib的代理，默认为false，表示基于jdk的，那么应该基于接口，所以getBean的时候，参数只能为接口，否则报错
public class Config {


}
