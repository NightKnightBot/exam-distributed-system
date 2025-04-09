package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "DIRECTIONS")
public class Direction {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DIRECTION_ID")
    int id;

    @Column(name = "DIRECTION")
    String direction;

    @Column(name = "SERVICE")
    String targetUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
}