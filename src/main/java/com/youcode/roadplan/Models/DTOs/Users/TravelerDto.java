package com.youcode.roadplan.Models.DTOs.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelerDto extends UserDto {

    private String userName;
}
