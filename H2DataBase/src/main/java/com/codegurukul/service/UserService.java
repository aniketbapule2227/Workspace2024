package com.codegurukul.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegurukul.entity.User;
import com.codegurukul.repository.UserRepository;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User addUser(User user) {
		return userRepository.save(user);
	}

	public List<User> userList() {
		return userRepository.findAll();
	}

	public User updateUser(Long id, User user) {
		User existinguser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("user not found"));

		existinguser.setName(user.getName());
		existinguser.setCity(user.getCity());
		existinguser.setGender(user.getGender());

		return userRepository.save(existinguser);

	}
}
