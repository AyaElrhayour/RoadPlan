package com.youcode.roadplan.Mappers;

import com.youcode.roadplan.Models.DTOs.Location.LocationDto;
import com.youcode.roadplan.Models.Entities.Location;
import org.mapstruct.Mapper;

@Mapper(componentModel = "springboot")
public interface LocationMapper {

    LocationDto toLocationDto(Location location);
    Location toLocation(LocationDto locationDto);

}
