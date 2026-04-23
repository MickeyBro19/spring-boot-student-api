package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping
    public List<Student> getAllStudents(){
        return service.getAllStudent();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    @PostMapping
    public String addStudent(@RequestBody Student student){
        return service.addStudent(student)?"Student added Successfully":"Error Adding Student";
    }

}
