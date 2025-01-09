package com.youcode.roadplan.Mappers;


import com.youcode.roadplan.Models.DTOs.Users.ActivityOwnerDto;
import com.youcode.roadplan.Models.Entities.ActivityOwner;
import org.mapstruct.Mapper;

@Mapper(componentModel = "springboot")
public interface ActivityOwnerMapper {

    ActivityOwnerDto toActivityOwnerDto(ActivityOwner activityOwner);
    ActivityOwner toActivityOwner(ActivityOwnerDto activityOwnerDto);

}
