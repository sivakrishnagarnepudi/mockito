package com.example.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan(basePackages = "com.example.demo.spring")
@Configuration
public class SpringDemoConfiguration {
    @Bean
    public HelloBeanService helloBeanService(){
        return new HelloBeanService();
    }
}
