package com.example.Center1.repository;

import com.example.Center1.entity.Center;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepository extends JpaRepository<Center, Integer> {
    Center findByRollno(String rollno);
}
