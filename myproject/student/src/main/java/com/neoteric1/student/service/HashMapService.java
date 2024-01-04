package com.neoteric1.student.service;



import collection.StudentMap;

import java.util.HashMap;

public class HashMapService<I extends Number, S> {
    public HashMap<Integer, String> getMapStudents(){

        StudentMap s1 = new StudentMap(101,"Tom");
        StudentMap s2 = new StudentMap(102, "John");
        HashMap<Integer,String> map =new HashMap<Integer,String>();

        addStudentToMap(map, s1);
        addStudentToMap(map, s2);

        return map;
    }
    public  void addStudentToMap(HashMap<Integer, String> map, StudentMap student) {
        map.put(student.getRollNo(), student.getName());
    }

    public String getStudentNameByRollNo(int rollNo) {
        HashMap<Integer, String> studentMap = getMapStudents();
        return studentMap.get(rollNo);
    }
}






