package com.example.repository;

import com.example.entity.SouthEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SouthRepository extends JpaRepository<SouthEntity, Integer> {
    SouthEntity findByDirection(String direction);
}
