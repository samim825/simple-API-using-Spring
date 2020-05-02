package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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


    @PostMapping(path = "/student",consumes = "application/json")
    public String addStudent(Student student){

        studentDao.save(student);

        return "Data Inserted";
    }

    @PutMapping(path = "/student",consumes = "application/json")
    public String updateStudent(Student student){
        studentDao.save(student);
        return "Data Updated";
    }
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id){
        studentDao.deleteById(id);
        return "Data Deleted";

    }

}
