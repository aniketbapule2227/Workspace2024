package com.springbootdemo.dtospringbootdemo.controller;

import com.springbootdemo.dtospringbootdemo.dto.UserRequestDto;
import com.springbootdemo.dtospringbootdemo.dto.UserResponseDto;
import com.springbootdemo.dtospringbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @PostMapping("/adduser")
    public ResponseEntity<UserResponseDto> addUserData(@RequestBody UserRequestDto userRequestDto) throws Exception {
       UserResponseDto userResponseDto=userService.addUser(userRequestDto);
        return new ResponseEntity<>(userResponseDto,HttpStatus.CREATED);
    }

    @GetMapping("/allusers")
    public ResponseEntity<List<UserResponseDto>> getallUser() throws Exception {
        List<UserResponseDto> userResponseDto2=userService.getProducts();
        return ResponseEntity.ok(userResponseDto2);
    }






}
