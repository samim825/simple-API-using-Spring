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


//    @PostMapping("/student")
//    public Student addStudent(){
//        System.out.println("Add student method visited");
//        Student student = new Student();
//        student.setDept("ICT");
//        student.setName("Basar");
//        studentDao.save(student);
//        return student;
//    }

    @GetMapping(path = "/student",consumes = "application/json")
    public List<Student> studentList(){

        return studentDao.findAll();
    }


    @RequestMapping("/")
    public String goHome(){
        System.out.println("home method visited");
        return "home";
    }

}
