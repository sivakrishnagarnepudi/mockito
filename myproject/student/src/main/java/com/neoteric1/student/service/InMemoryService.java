package com.neoteric1.student.service;

import collection.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class InMemoryService {

    static Predicate<Student> countryPredicate =(i) ->i.getCountry().equalsIgnoreCase("India");
    public List<Student> getStudent() {


        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student("POLLARD", "WESTINDIES");
        Student s2 = new Student("BAIRSTOW", "UK");
        Student s3 = new Student("MARK", "USA");
        ;
        Student s4 = new Student("MALLESH", "INDIA");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        List<Student> streamCountryPredicate = studentList.stream()
                .filter(countryPredicate)
                //.map(Student::getName)
                .collect(Collectors.toList());
        return streamCountryPredicate;
    }


}
