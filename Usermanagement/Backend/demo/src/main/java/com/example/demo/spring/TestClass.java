package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {
    public static void main(String[] args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext
                (SpringDemoConfiguration.class);
    }
}
