package com.example.DockerStudentApp.controller;

import com.example.DockerStudentApp.model.Student;
import com.example.DockerStudentApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return service.getAllStudents();
    }
}
