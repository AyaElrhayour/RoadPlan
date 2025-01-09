package com.youcode.roadplan.Models.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {

    private UUID id;
    private String content;
    private int rating;
    private LocalDate date;
    private UUID locationId; // Linked to Location
    private UUID travelerId;
}
