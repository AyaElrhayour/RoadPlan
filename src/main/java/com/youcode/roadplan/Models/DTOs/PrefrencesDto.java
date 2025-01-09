package com.youcode.roadplan.Models.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrefrencesDto {

    private UUID id;
    private String category;
    private List<String> keywords;
}
