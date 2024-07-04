package com.example.demo;

import com.example.demo.spring.HelloBeanService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringDemoConfiguration {
    @Bean
    public HelloBeanService helloBeanService(){
        return new HelloBeanService();
    }
}
