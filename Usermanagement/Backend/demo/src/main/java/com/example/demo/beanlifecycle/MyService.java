package com.example.demo.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class MyService {
    @PostConstruct
    public void init(){
        System.out.println("MyService init method called");
    }

    public MyService(){
        System.out.println("MyService no-args constructor called");
    }

    @PreDestroy
    public void destory(){
        System.out.println("MyService destroy method called");
    }
}
