package com.example.demodocker.controller;

import com.example.demodocker.entity.Student;
import com.example.demodocker.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    public StudentRepository studentRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello world! How are you!";
    }

    @PostMapping("/add")
    public String createNewStudent(@RequestBody Student student) {
        try{
            studentRepository.save(student);
        }catch (Exception ex) {
            return "Insert failed: " + ex.toString();
        }
        return "Insert successfully!";
    }

    @GetMapping("/get-all")
    public List<Student> getAllStudent() {
        return (List<Student>) studentRepository.findAll();
    }
}
