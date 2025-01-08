package com.youcode.roadplan.Models.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Travler extends User {

    private String userName;

    @OneToMany(mappedBy = "traveler")
    private List<TravelPlan> travelPlans;

    @OneToMany(mappedBy = "traveler")
    private List<Preferences> preferences;
}
