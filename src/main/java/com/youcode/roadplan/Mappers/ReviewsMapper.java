package com.youcode.roadplan.Mappers;


import com.youcode.roadplan.Models.DTOs.Review.ReviewsDto;
import com.youcode.roadplan.Models.Entities.Reviews;
import org.mapstruct.Mapper;

@Mapper(componentModel = "springboot")
public interface ReviewsMapper {

    ReviewsDto toReviewsDto(Reviews reviews);
    Reviews toReviews(ReviewsDto reviewsDto);
}
