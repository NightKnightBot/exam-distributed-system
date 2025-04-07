package com.example.repository;

import com.example.entity.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectionRepository extends JpaRepository<Direction, Integer> {
    Direction findByDirection(String direction);
}
