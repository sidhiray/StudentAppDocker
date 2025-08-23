package com.example.DockerStudentApp.service;

import com.example.DockerStudentApp.model.Student;
import com.example.DockerStudentApp.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public List<Student> getAllStudents(){

        return repo.findAll();
    }


//    List.of(
//            new Student(1, "John", 25),
//                new Student(2, "Steve", 28),
//                new Student(3, "Kevin", 22)
//
//        );
}
