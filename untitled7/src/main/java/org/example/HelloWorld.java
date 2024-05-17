package org.example;

public class HelloWorld {
    public static void main(String[] args) {
        try {
            String envValue = System.getProperty("env");
           // System.out.println(envValue.toUpperCase());
            System.out.println("System" + System.getProperty("env"));
            System.out.println("Welcome to handle Exception handeling");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}