package com.youcode.roadplan.Models.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {

    @Id
    @UuidGenerator
    private UUID id;

    private String content;
    private String rating;
    private LocalDate date;


    @ManyToOne
    private Location location;

    @ManyToOne
    private Traveler traveler;
}
