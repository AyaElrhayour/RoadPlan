package com.youcode.roadplan.Models.Entities;

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
public class Transport {

    @Id
    @UuidGenerator
    private UUID id;

    private String type;
    private double price;
    private double duration;
}
