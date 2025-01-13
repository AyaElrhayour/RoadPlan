package com.youcode.roadplan.Repositories;

import com.youcode.roadplan.Models.Entities.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TravelerRepository extends JpaRepository<Traveler, UUID> {

    Traveler findByFullNameAndUserName(String SEARCH);
}
