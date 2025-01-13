package com.youcode.roadplan.Repositories;

import com.youcode.roadplan.Models.Entities.Activities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ActivitiesRepository extends JpaRepository<Activities, UUID> {

    Optional<Activities> findByTitle(String title);
}
