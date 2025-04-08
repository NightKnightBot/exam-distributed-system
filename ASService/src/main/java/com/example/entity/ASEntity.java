package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="NORTH_STATES")
public class ASEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CENTER_ID")
    int id;

    @Column(name="STUDENT_SERVICE_URL")
    String targetUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }



}
