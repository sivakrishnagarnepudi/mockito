package com.neoteric1.student.service;

public class SchoolService {
    private static int teachersCount=10;
    public SchoolService(){
        System.out.println(" from school service ="+teachersCount);
    }
    public int teachersCount(){
        return teachersCount;
    }
    public int teachersAdd(){
        return teachersCount=teachersCount+1;
    }
    public int teachersRemove(){
        return teachersCount=teachersCount-1;
    }
}
