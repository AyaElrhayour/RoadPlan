package com.youcode.roadplan.Repositories;

import com.youcode.roadplan.Models.Entities.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface GroupRepository extends JpaRepository<Group, UUID> {

    List<Group> findByName(String name);
}
