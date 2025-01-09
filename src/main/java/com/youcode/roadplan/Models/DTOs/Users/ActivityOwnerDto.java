package com.youcode.roadplan.Models.DTOs.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityOwnerDto extends UserDto {

    private String businessName;

}
