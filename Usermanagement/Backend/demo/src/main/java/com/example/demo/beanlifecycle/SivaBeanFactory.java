package com.example.demo.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class SivaBeanFactory implements BeanFactoryAware {
    private BeanFactory beanFactory;
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
    }
    public  void getSivaBeanName(){
        SivaBeanName sivaBeanName=beanFactory.getBean(SivaBeanName.class);
    }
}

