package com.neotric.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main( String[] args ) {
        SpringApplication.run(DemoApplication.class, args);
        //mvn archetype:generate it is used in the terminal command for the add maven repo
    }
}
