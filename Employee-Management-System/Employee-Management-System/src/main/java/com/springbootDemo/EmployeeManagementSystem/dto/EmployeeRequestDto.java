package com.springbootDemo.EmployeeManagementSystem.dto;

import com.springbootDemo.EmployeeManagementSystem.entity.Department;
import com.springbootDemo.EmployeeManagementSystem.entity.Project;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class EmployeeRequestDto {


    @NotBlank(message = "name should not be empty")
    private String emp_name;
    @Min(value=1,message = "salary should not be empty")
    private Long salary;
    @NotBlank(message = "department should not be empty")
    private Department department;
    private Project project;

    public EmployeeRequestDto() {
    }

    public EmployeeRequestDto( String emp_name, Long salary, Department department, Project project) {

        this.emp_name = emp_name;
        this.salary = salary;
        this.department = department;
        this.project = project;
    }



    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
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
}
