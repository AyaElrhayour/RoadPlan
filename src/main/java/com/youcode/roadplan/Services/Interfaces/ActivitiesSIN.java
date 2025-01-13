package com.youcode.roadplan.Services.Interfaces;

import com.youcode.roadplan.Models.DTOs.Activity.ActivityDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ActivitiesSIN {

    ActivityDto addActivity(ActivityDto activity);
    ActivityDto updateActivity(ActivityDto activity);
    ActivityDto getActivityById(UUID id);
    boolean deleteActivity(UUID id);
    List<ActivityDto> getAllActivities();
    ActivityDto getActivityByName(String name);


}