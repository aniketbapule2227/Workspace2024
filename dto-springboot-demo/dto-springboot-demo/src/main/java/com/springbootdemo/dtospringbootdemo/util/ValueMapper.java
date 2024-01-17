package com.springbootdemo.dtospringbootdemo.util;

import com.springbootdemo.dtospringbootdemo.dto.UserRequestDto;
import com.springbootdemo.dtospringbootdemo.dto.UserResponseDto;
import com.springbootdemo.dtospringbootdemo.entity.User;

public class ValueMapper {

    public static User convertToEntity(UserRequestDto userDto){
        User user= new User();
        user.setName(userDto.getName());
        user.setCity(userDto.getCity());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setNumber(userDto.getNumber());

        return user;
    }

    public static UserResponseDto convertToDto(User user){
        UserResponseDto userDto= new UserResponseDto();
        user.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setCity(user.getCity());
        userDto.setEmail(user.getEmail());

        return userDto;
    }


}
