package com.kaikeba.dao;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = {"com.kaikeba.dao","com.kaikeba.aop"})
@EnableAspectJAutoProxy(proxyTargetClass = false) //启用aspectj注解
public class Config {


}
