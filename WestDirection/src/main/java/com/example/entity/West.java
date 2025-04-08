package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "WEST")
public class West {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WEST_ID")
    int id;

    @Column(name = "WEST_STATE")
    String direction;

    @Column(name = "WEST_SERVICE")
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