package com.youcode.roadplan.Models.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private UUID id;
    private String fullName;
    private String email;
    private String profilePicture;


}
