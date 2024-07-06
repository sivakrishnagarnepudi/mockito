package com.example.demo.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name = "CustomBeanName")
    public SivaBeanName getSivaBeanName(){
        return new SivaBeanName();
    }
}
