package com.youcode.roadplan.Models.DTOs.Activity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityDto {

    private UUID id;
    private String title;
    private String description;
}
