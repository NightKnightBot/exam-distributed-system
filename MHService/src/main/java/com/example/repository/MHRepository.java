package com.example.repository;

import com.example.entity.MHEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MHRepository extends JpaRepository<MHEntity, Integer> {
    MHEntity findByDirection(String direction);
}
