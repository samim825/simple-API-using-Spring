package com.example.demo.dao;


import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by User on 5/1/2020.
 */
@RepositoryRestResource(collectionResourceRel="students",path="students")
public interface StudentDao extends JpaRepository<Student,Integer> {


}
