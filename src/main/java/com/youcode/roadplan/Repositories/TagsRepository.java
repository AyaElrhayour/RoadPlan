package com.youcode.roadplan.Repositories;

import com.youcode.roadplan.Models.Entities.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface TagsRepository extends JpaRepository<Tags, UUID> {

    List<Tags> findByName(String name);
}
