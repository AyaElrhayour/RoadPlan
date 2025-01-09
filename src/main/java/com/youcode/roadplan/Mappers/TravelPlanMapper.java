package com.youcode.roadplan.Mappers;


import com.youcode.roadplan.Models.DTOs.TravelPlan.TravelPlanDto;
;
import com.youcode.roadplan.Models.Entities.TravelPlan;
import org.mapstruct.Mapper;

@Mapper(componentModel = "springboot")
public interface TravelPlanMapper {

    TravelPlanDto toTravelerDto(TravelPlan travelPlan);
    TravelPlan toTraveler(TravelPlanDto travelPlanDto);
}
