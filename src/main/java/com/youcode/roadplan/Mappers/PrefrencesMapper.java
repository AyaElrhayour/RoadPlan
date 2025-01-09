package com.youcode.roadplan.Mappers;

import com.youcode.roadplan.Models.DTOs.Prefrences.PrefrencesDto;
import com.youcode.roadplan.Models.Entities.Preferences;
import org.mapstruct.Mapper;

@Mapper(componentModel = "springboot")
public interface PrefrencesMapper {

    PrefrencesDto toPrefrencesDto (Preferences preferences);
    Preferences toPreferences (PrefrencesDto preferencesDto);

}
