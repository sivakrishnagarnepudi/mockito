package com.example.demo.spring;

import org.springframework.stereotype.Service;

@Service(value = "springHelloService")
public class SpringHelloService {
    public String sayHiService(){
        return "HelloWorld";
    }
}
