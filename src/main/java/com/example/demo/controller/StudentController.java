package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by User on 5/1/2020.
 */

@RestController
public class StudentController {

    @Autowired
    StudentDao studentDao;



    @GetMapping(path = "/student",consumes = "application/json")
    public List<Student> studentList(){

        return studentDao.findAll();
    }




    @PostMapping("/student")
    public Student addStudent(Student student){

        studentDao.save(student);

        System.out.println("home method visited");
        return student;
    }

}
