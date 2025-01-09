package com.youcode.roadplan.Mappers;

import com.youcode.roadplan.Models.DTOs.Transport.TransportDto;
import com.youcode.roadplan.Models.Entities.Transport;
import org.mapstruct.Mapper;

@Mapper(componentModel = "springboot")
public interface TransportMapper {

    TransportDto toTransportDto(Transport transport);
    Transport toTransport(TransportDto transportDto);
}
