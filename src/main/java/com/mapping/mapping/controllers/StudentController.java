package com.mapping.mapping.controllers;

import com.mapping.mapping.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student")
    public void getStudents(){
        studentRepository.findAllStudentsPspAndBrand();
    }
}
