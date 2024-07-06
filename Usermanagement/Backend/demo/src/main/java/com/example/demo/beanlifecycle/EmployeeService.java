package com.example.demo.beanlifecycle;

import org.springframework.context.annotation.Bean;

public class EmployeeService  {
    private Employee employee;
    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeService() {
        System.out.println("EmployeeService no-args constructor called");
    }



}