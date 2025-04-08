package com.example.entity;

import jakarta.persistence.*;
import jakarta.websocket.ClientEndpoint;

@Entity
@Table(name="SOUTH")
public class SouthEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SOUTH_ID")
    int id;

    @Column(name="SOUTH_STATE")
    String direction;

    @Column(name="SOUTH_SERVICE")
    String targetUrl;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}