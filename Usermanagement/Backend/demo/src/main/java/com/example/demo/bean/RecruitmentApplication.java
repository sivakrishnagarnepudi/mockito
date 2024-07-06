package com.example.demo.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RecruitmentApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(RecruitmentApplication.class, args);

        // Retrieve the bean from the application context
        DataProcessor dataProcessor = context.getBean(DataProcessor.class);
        dataProcessor.processData("Sample data");

        // Shut down the Spring application context to trigger destruction of beans
        SpringApplication.exit(context);
    }
}
