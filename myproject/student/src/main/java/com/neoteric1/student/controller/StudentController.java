package com.neoteric1.student.controller;

import com.neoteric1.student.model.StudentEntity;
import com.neoteric1.student.service.SchoolService;
import com.neoteric1.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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


    }



