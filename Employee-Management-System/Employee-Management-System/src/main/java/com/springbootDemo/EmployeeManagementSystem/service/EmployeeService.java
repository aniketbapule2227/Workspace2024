package com.springbootDemo.EmployeeManagementSystem.service;

import com.springbootDemo.EmployeeManagementSystem.dto.EmployeeRequestDto;
import com.springbootDemo.EmployeeManagementSystem.dto.EmployeeResponseDto;
import com.springbootDemo.EmployeeManagementSystem.entity.Employee;
import com.springbootDemo.EmployeeManagementSystem.exception.EmployeeNotFoundException;
import com.springbootDemo.EmployeeManagementSystem.repository.DepartmentRepository;
import com.springbootDemo.EmployeeManagementSystem.repository.EmployeeRepository;
import com.springbootDemo.EmployeeManagementSystem.repository.ProjectRepository;
import com.springbootDemo.EmployeeManagementSystem.util.ValueMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private static final Logger logger= LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeResponseDto addEmployee(EmployeeRequestDto employeeRequestDto){
        logger.info("EmployeeService : addemployee() exicution start");
        EmployeeResponseDto employeeResponseDto = null;
    try {
        Employee newEmployee = ValueMapper.convertToEntity(employeeRequestDto);
        Employee resultEmployee = employeeRepository.save(newEmployee);
        employeeResponseDto = ValueMapper.convertToDto(resultEmployee);
    } catch (Exception e) {
        logger.error("Exception occured while obejct persisting in database");
        throw new RuntimeException(e);
    }
        logger.info("EmploeeService : create new employee excution ended");
        return employeeResponseDto;
    }

    public List<EmployeeResponseDto> getAllEmployee() throws EmployeeNotFoundException {
    List<EmployeeResponseDto> employeeResponseDtoList=null;


    try{
       List<Employee>  employeeList= employeeRepository.findAll();
       if(!employeeList.isEmpty()){
           employeeResponseDtoList=employeeList.stream()
                   .map(ValueMapper::convertToDto)
                   .collect(Collectors.toList());
       }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }


        return employeeResponseDtoList;
    }
}
