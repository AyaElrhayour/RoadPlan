package com.youcode.roadplan.Models.DTOs.Tags;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagsDto {

    private UUID id;
    private String name;
}
