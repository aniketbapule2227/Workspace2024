package com.springbootdemo.dtospringbootdemo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserResponseDto {


    @NotBlank(message = "user should not empty")
    private String name;
    @NotBlank(message = "city should not be empty")
    private String city;
    @Email(message = "enter valid email")
    private String email;

    public UserResponseDto() {
    }

    public UserResponseDto(String name, String city, String email) {
        this.name = name;
        this.city = city;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
