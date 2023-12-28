package com.neoteric1.student.service;

import com.neoteric1.student.model.StudentEntity;
import com.neoteric1.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<StudentEntity> getStudents(){
        return studentRepository.findAll();
    }
}
