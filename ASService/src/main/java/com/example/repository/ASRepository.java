package com.example.repository;

import com.example.entity.ASEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ASRepository extends JpaRepository<ASEntity, Integer> {
    ASEntity findByDirection(String direction);
}
