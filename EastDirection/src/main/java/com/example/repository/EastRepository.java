package com.example.repository;

import com.example.entity.East;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EastRepository extends JpaRepository<East, Integer> {
    East findByDirection(String direction);
}
