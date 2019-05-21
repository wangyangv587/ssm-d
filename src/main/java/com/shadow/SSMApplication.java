package com.shadow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 启动类，需要继承SpringBootServletInitializer，并重写configure方法，否侧Tomcat无法找到入口
 * @author Shadow
 * @date 2019/5/20 15:35
 */
@SpringBootApplication
public class SSMApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SSMApplication.class);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SSMApplication.class);
    }
}
