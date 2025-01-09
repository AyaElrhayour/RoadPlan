package com.youcode.roadplan.Mappers;

import com.youcode.roadplan.Models.DTOs.Activity.ActivityDto;
import com.youcode.roadplan.Models.Entities.Activities;
import org.mapstruct.Mapper;

@Mapper(componentModel = "springboot")
public interface ActivityMapper {

    ActivityDto toActivityDto(Activities activities );
    Activities toActivities(ActivityDto activityDto);
}
