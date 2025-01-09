package com.youcode.roadplan.Mappers;


import com.youcode.roadplan.Models.DTOs.Users.AdminDto;
import com.youcode.roadplan.Models.Entities.Admin;
import org.mapstruct.Mapper;

@Mapper(componentModel = "springboot")
public interface AdminMapper {

    AdminDto ToAdminDto(Admin admin);
    Admin ToAdmin(AdminDto adminDto);
}
