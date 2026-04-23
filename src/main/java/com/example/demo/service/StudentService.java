package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<Student> students=new ArrayList<>();

    public List<Student> getAllStudent(){
        return students;
    }

    public Boolean addStudent( Student student){
        students.add(student);
        return true;
    }

    public Student getStudentById(int id) {
        return students.stream()
                .filter(s->s.getId()==id)
                .findFirst()
                .orElse(null);
    }
}
