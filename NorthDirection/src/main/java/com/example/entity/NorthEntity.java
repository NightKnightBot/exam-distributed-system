package com.example.entity;

import jakarta.persistence.*;
import jakarta.websocket.ClientEndpoint;

@Entity
@Table(name="NORTH")
public class NorthEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="NORTH_ID")
    int id;

    @Column(name="NORTH_STATE")
    String direction;

    @Column(name="NORTH_SERVICE")
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