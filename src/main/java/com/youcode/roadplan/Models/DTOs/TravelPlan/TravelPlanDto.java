package com.youcode.roadplan.Models.DTOs.TravelPlan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelPlanDto {

    private int id;
    private String city;
    private List<UUID> hotels;
    private List<UUID> activities;
    private List<UUID> transportOptions;
}
