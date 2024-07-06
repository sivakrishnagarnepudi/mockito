package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class LoggerService {
    public void log(String message) {
        System.out.println("Logging message: " + message);
    }
}
