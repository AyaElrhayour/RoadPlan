package com.youcode.roadplan.Services.Interfaces;

import com.youcode.roadplan.Models.DTOs.Users.ActivityOwnerDto;
import org.apache.commons.lang3.ClassUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ActivityOwnerSIN extends UserSIN {

    ActivityOwnerDto updateActivityOwner(ActivityOwnerDto activityOwner);
    ActivityOwnerDto getActivityOwnerById(UUID id);
    boolean deleteActivityOwner(UUID id);
    List<ActivityOwnerDto> getActivityOwners();
    ActivityOwnerDto getActivityOwnerByNameAndBusinessName(String searchName);


}
