package com.youcode.roadplan.Repositories;

import com.youcode.roadplan.Models.Entities.Preferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PreferencesRepository extends JpaRepository<Preferences, UUID> {
}
