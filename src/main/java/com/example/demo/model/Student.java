package com.example.demo.model;

import javax.persistence.*;

/**
 * Created by User on 5/1/2020.
 */
@Entity
@Table(name="student_table")
public class Student {


    @Id
    @GeneratedValue
    @Column(name="student_id")
    private Integer id;

    @Column(name="student_name")
    private String name;

    @Column(name="student_dept")
    private String dept;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
