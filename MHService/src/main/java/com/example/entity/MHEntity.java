package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="MAHARASTRA")
public class MHEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CENTER_ID")
    int id;

    @Column(name = "CENTER_UID")
    String uid;

    @Column(name="CENTER_URL")
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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
