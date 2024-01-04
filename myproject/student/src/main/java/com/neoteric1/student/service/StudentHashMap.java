package com.neoteric1.student.service;

public class StudentHashMap {
    public int rollNo;
    public String name;

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public StudentHashMap(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}
