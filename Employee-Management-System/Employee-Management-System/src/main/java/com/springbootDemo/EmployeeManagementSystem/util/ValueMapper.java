package com.springbootDemo.EmployeeManagementSystem.util;

import com.springbootDemo.EmployeeManagementSystem.dto.EmployeeRequestDto;
import com.springbootDemo.EmployeeManagementSystem.dto.EmployeeResponseDto;
import com.springbootDemo.EmployeeManagementSystem.entity.Department;
import com.springbootDemo.EmployeeManagementSystem.entity.Employee;
import com.springbootDemo.EmployeeManagementSystem.entity.Project;

public class ValueMapper {

    //converting EmployeeRequestDto to Employee.
    public static Employee convertToEntity(EmployeeRequestDto employeeRequestDto){
        Employee employee= new Employee();
        Department department= new Department();
        Project project= new Project();


        employee.setEmp_name(employeeRequestDto.getEmp_name());
        employee.setSalary(employeeRequestDto.getSalary());
        department.setDept_id(employeeRequestDto.getDepartment().getDept_id());
        department.setDept_name(employeeRequestDto.getDepartment().getDept_name());
        project.setProject_id(employeeRequestDto.getProject().getProject_id());
        project.setProject_name(employeeRequestDto.getProject().getProject_name());
        employee.setDepartment(employeeRequestDto.getDepartment());
        employee.setProject(employeeRequestDto.getProject());
        return employee;
    }


    public static EmployeeResponseDto convertToDto(Employee employee){
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
        employeeResponseDto.setId(employee.getId());
        employeeResponseDto.setEmp_name(employee.getEmp_name());
        employeeResponseDto.setDepartment(employee.getDepartment());
        employeeResponseDto.setProject(employee.getProject());
        return employeeResponseDto;


    }
}
