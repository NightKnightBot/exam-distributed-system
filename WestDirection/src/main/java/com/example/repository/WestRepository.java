package com.example.repository;

import com.example.entity.West;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WestRepository extends JpaRepository<West, Integer> {
    West findByDirection(String direction);
}
