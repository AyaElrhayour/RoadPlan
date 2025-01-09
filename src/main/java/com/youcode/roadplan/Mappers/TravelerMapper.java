package com.youcode.roadplan.Mappers;


import com.youcode.roadplan.Models.DTOs.Users.TravelerDto;
import com.youcode.roadplan.Models.Entities.Traveler;
import org.mapstruct.Mapper;

@Mapper(componentModel = "springboot")
public interface TravelerMapper {

    TravelerDto toTravelerDto(Traveler traveler);
    Traveler toTraveler(TravelerDto travelerDto);
}
