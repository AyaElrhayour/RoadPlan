package com.youcode.roadplan.Services.Interfaces;


import com.youcode.roadplan.Models.DTOs.Users.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserSIN {

    UserDto signUp(UserDto user);
    UserDto login(UserDto user);
}
