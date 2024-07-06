package com.example.demo.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {
    public static void main(String[] args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext(SpringDemoConfiguration.class);
        SpringHelloService service=(SpringHelloService)ctx.getBean("springHelloService");
        SpringHelloService service2=  ctx.getBean("springHelloService",SpringHelloService.class);


        String byBeanName=service.sayHiService();
        String byBeanNameAndType=service2.sayHiService();

        SpringHelloService springHelloService=new SpringHelloService();
        String coreJava=springHelloService.sayHiService();


        System.out.println("byBeanName "+byBeanName);
        System.out.println("By BeanName & Type "+byBeanNameAndType);
        System.out.println("Core Java "+coreJava);

    }
}
