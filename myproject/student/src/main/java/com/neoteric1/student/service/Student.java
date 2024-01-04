package com.neoteric1.student.service;

public class Student {
    private String name;
    private String country;

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Student(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
