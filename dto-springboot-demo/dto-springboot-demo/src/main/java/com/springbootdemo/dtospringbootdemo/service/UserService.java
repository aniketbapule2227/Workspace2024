package com.springbootdemo.dtospringbootdemo.service;

import com.springbootdemo.dtospringbootdemo.dto.UserRequestDto;
import com.springbootdemo.dtospringbootdemo.dto.UserResponseDto;
import com.springbootdemo.dtospringbootdemo.entity.User;
import com.springbootdemo.dtospringbootdemo.repository.UserRepository;
import com.springbootdemo.dtospringbootdemo.util.ValueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponseDto addUser(UserRequestDto userRequestDto)throws Exception {
                UserResponseDto userResponseDto = null;

        try {
            User user = ValueMapper.convertToEntity(userRequestDto);
            User userResult = userRepository.save(user);
          UserResponseDto  userResponseDto1 = ValueMapper.convertToDto(userResult);
        } catch (Exception e) {

        }
        return userResponseDto;

    }


    public List<UserResponseDto> getProducts() throws Exception {
        List<UserResponseDto> UserResponseDTOS = null;

        try {


            List<User> productList = userRepository.findAll();

            if (!productList.isEmpty()) {
                UserResponseDTOS = productList.stream()
                        .map(ValueMapper::convertToDto)
                        .collect(Collectors.toList());
            } else {
                UserResponseDTOS = Collections.emptyList();
            }


        } catch (Exception ex) {

        }


        return UserResponseDTOS;
    }
}
