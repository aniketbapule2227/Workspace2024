package com.springbootDemo.EmployeeManagementSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Dept_id;
    private String dept_name;

    public Long getDept_id() {
        return Dept_id;
    }

    public void setDept_id(Long dept_id) {
        Dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }


}
