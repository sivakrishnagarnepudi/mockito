package com.neoteric.exceptionhandling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
    @GetMapping(value="/toUpperCase")

    public String toUpperCase(){
        String upperCaseName=null;
        try {
            System.out.println("Thread Name From Controller"+Thread.currentThread().getName());
            Thread.sleep(5000);
            String name=null;
             upperCaseName=name.toUpperCase();

        }catch (Exception e){
            System.out.println("ExceptionalOccured"+e);
            upperCaseName="name is null";
        }

        return upperCaseName;
    }

}
