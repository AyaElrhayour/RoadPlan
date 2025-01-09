package com.youcode.roadplan.Mappers;


import com.youcode.roadplan.Models.DTOs.Tags.TagsDto;
import com.youcode.roadplan.Models.Entities.Tags;
import org.mapstruct.Mapper;

@Mapper(componentModel = "springboot")
public interface TagsMapper {

    TagsDto toTagsDto(Tags tags);
    Tags toTags(TagsDto tagsDto);
}
