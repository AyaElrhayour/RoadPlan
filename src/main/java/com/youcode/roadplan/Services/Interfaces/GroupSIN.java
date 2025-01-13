package com.youcode.roadplan.Services.Interfaces;

import com.youcode.roadplan.Models.DTOs.Users.GroupDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface GroupSIN {

    GroupDto createGroup(GroupDto group);
    GroupDto updateGroup(GroupDto group);
    GroupDto getGroupById(UUID id);
    boolean deleteGroup(UUID id);
    List<GroupDto> getAllGroups();
    GroupDto getGroupByName(String name);
}
