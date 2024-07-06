package com.example.demo.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataProcessor {
    private final DataService dataService;
    private final LoggerService loggerService;

    @Autowired
    public DataProcessor(DataService dataService, LoggerService loggerService) {
        this.dataService = dataService;
        this.loggerService = loggerService;
        System.out.println("DataProcessor bean is being instantiated with dependencies.");
    }

    @PostConstruct
    public void init() {
        System.out.println("DataProcessor bean is being initialized.");
    }

    public void processData(String data) {
        loggerService.log("Start processing data: " + data);
        // Example processing logic
        String processedData = data.toUpperCase();
        loggerService.log("Processed data: " + processedData);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DataProcessor bean is being destroyed. Performing cleanup.");
        // Example cleanup tasks
        loggerService.log("Closing resources...");
        // Perform any other cleanup tasks as needed
    }
}
