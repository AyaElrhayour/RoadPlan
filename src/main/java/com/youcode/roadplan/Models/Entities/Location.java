package com.youcode.roadplan.Models.Entities;


import com.youcode.roadplan.Models.Enums.LocationCategory;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    @Id
    @UuidGenerator
    private UUID id;

    private String name;
    private int rating;
    private LocationCategory locationCategory;

}
