package com.springbootDemo.EmployeeManagementSystem.dto;

import com.springbootDemo.EmployeeManagementSystem.entity.Department;
import com.springbootDemo.EmployeeManagementSystem.entity.Project;

public class EmployeeResponseDto {

    private Long id;
    private String emp_name;
    private Department department;
    private Project project;

    public EmployeeResponseDto() {
    }

    public EmployeeResponseDto(Long id, String emp_name, Department department, Project project) {
        this.id = id;
        this.emp_name = emp_name;
        this.department = department;
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "EmployeeResponseDto{" +
                "id=" + id +
                ", emp_name='" + emp_name + '\'' +
                ", department=" + department +
                ", project=" + project +
                '}';
    }
}
