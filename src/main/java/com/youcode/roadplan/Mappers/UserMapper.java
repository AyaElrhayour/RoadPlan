package com.youcode.roadplan.Mappers;

import com.youcode.roadplan.Models.DTOs.Users.UserDto;
import com.youcode.roadplan.Models.Entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "springboot")
public interface UserMapper {

    UserDto toUserDto(User user);
    User toUser(UserDto userDto);

}
