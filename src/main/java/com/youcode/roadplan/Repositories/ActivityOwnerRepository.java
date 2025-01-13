package com.youcode.roadplan.Repositories;

import com.youcode.roadplan.Models.Entities.ActivityOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ActivityOwnerRepository extends JpaRepository<ActivityOwner, UUID> {

    ActivityOwner findByFullNameAndBusinessName(String searchName);
}
