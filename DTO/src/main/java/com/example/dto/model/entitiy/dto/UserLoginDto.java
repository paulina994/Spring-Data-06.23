package com.example.dto.model.entitiy.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
public class UserLoginDto {

    @Email(message = "Enter valid email")
    private String email;

    @Pattern(regexp = "[A-Za-z\\d]{6,}", message = "Enter valid password")
    private String password;

    public UserLoginDto() {
    }

    public UserLoginDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}