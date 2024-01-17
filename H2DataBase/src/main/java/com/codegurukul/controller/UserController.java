package com.codegurukul.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codegurukul.entity.User;
import com.codegurukul.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	
	
	@PostMapping("/adduser")
	public ResponseEntity<String> addNewUser(@RequestBody User user){
	User useradded	=userService.addUser(user);
	return new ResponseEntity<String>("user created",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/userlist")
	public ResponseEntity<List<User>> getUserList(){
		List<User> userList=userService.userList();
		return ResponseEntity.ok(userList);
	}
		@PutMapping("/updateUser/{id}")
	public ResponseEntity<User> updateUserById(@PathVariable Long id,@RequestBody User updatedUser){
		User user=userService.updateUser(id, updatedUser);
		return ResponseEntity.ok(user);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
