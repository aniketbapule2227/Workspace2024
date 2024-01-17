package com.springbootDemo.EmployeeManagementSystem.controller;

import com.springbootDemo.EmployeeManagementSystem.dto.EmployeeRequestDto;
import com.springbootDemo.EmployeeManagementSystem.dto.EmployeeResponseDto;
import com.springbootDemo.EmployeeManagementSystem.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
private EmployeeService employeeService;


@PostMapping("/add")
public ResponseEntity<EmployeeResponseDto> saveEmployee( @RequestBody  EmployeeRequestDto employeeRequestDto){

    EmployeeResponseDto responseDto=employeeService.addEmployee(employeeRequestDto);

    return new ResponseEntity<>(responseDto, HttpStatus.OK);
}

@GetMapping("/getAll")
public ResponseEntity<List<EmployeeResponseDto>>getAll(){
    List<EmployeeResponseDto> employeeResponseDtoList=employeeService.getAllEmployee();
    return new ResponseEntity<>(employeeResponseDtoList,HttpStatus.OK);
}

}
