package com.neotric.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo {
    public static void main( String[] args ) {
        SpringApplication.run(Demo.class, args);
        //mvn archetype:generate it is used in the terminal command for the add maven repo
    }
}
