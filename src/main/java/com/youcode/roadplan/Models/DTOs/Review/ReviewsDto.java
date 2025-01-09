package com.youcode.roadplan.Models.DTOs.Review;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewsDto {

    private UUID id;
    private String content;
    private int rating;
    private LocalDate date;
    private UUID locationId;
    private UUID travelerId;
}
