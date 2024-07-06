package com.example.demo.beanlifecycle;

import org.springframework.beans.factory.BeanNameAware;

public class SivaBeanName implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
}
