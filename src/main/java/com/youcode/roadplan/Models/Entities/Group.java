package com.youcode.roadplan.Models.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {

    @Id
    @UuidGenerator
    private UUID id;

    private String name;

    @ManyToMany
    private List<Traveler> members;

    @ManyToMany
    private List<Preferences> sharedPreferences;
}
