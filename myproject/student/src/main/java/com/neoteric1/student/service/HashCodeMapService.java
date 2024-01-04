package com.neoteric1.student.service;

import collection.StudentMap;

import java.util.HashMap;
import java.util.Map;

public class HashCodeMapService {
    public static void main (String args[]){
        Map studentmap =new HashMap<>();

        StudentMap s=new StudentMap(001,"Siva");
        studentmap.put(s,s);
        StudentMap s2=new StudentMap(002,"Siva");
        studentmap.put(s2,s2);
        StudentMap s3=new StudentMap(003,"Siva");
        studentmap.put(s3,s3);

    }
}
