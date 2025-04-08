package com.example.repository;

import com.example.entity.NorthEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NorthRepository extends JpaRepository<NorthEntity, Integer> {
    NorthEntity findByDirection(String direction);
}
