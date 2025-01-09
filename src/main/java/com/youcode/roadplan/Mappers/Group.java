package com.youcode.roadplan.Mappers;


import com.youcode.roadplan.Models.DTOs.Users.GroupDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "springboot")
public interface Group {

    GroupDto toGroupDto(Group group);
    Group toGroup(GroupDto groupDto);
}
