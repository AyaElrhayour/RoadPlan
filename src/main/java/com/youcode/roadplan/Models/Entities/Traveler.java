package com.youcode.roadplan.Models.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Traveler extends User {

    private String userName;

    @ManyToMany
    private List<TravelPlan> travelPlans;

    @ManyToMany
    private List<Preferences> preferences;

    @OneToMany
    private List<Reviews> reviews;

    @ManyToMany
    private List<Group> groups;
}
