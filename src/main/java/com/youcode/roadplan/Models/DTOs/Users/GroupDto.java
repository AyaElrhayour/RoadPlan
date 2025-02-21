package com.youcode.roadplan.Models.DTOs.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupDto {

    private UUID id;
    private String name;
    private List<UUID> members;
    private List<UUID> sharedPreferences;
}
