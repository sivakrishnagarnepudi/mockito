package com.neoteric1.student.controller;

import collection.Student;
import com.neoteric1.student.model.StudentEntity;
import com.neoteric1.student.service.*;
import com.neoteric1.student.service.StudentHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping(value = "/getSudents")
    public List<StudentEntity> getStudents(){
        return studentService.getStudents();
    }
    @GetMapping(value ="/getTeachersCount")
    public int teachersCount() {
        SchoolService s = new SchoolService();
       return s.teachersCount();
    }
    @GetMapping(value="/teachersAdd")
    public int teachersAdd(){
        SchoolService ss =new SchoolService();
        return ss.teachersAdd();
    }
    @GetMapping(value="/teachersRemove")
    public int teachersRemove(){
        SchoolService sss =new SchoolService();
        return sss.teachersRemove();
    }
    @GetMapping(value="/getStudentList")
    public List<Student> getStudent() {
        InMemoryService inmem =new InMemoryService();

        return inmem.getStudent();
    }
    @GetMapping(value = "/getStudentMap")
    public String getStudentMap () {
        HashMapService inServiceHashMap = new HashMapService();
        return inServiceHashMap.getStudentNameByRollNo(102);

    }

    }






