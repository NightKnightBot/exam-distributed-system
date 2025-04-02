package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="SOUTH_STATES")
public class SouthEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SOUTH_ID")
    int id;
    @Column(name = "SOUTH_STATE")
    String southState;
    @Column(name = "SOUTH_SERVICE")
    String southCentre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSouthState() {
        return southState;
    }

    public void setSouthState(String southState) {
        this.southState = southState;
    }

    public String getSouthCentre() {
        return southCentre;
    }

    public void setSouthCentre(String southCentre) {
        this.southCentre = southCentre;
    }
}
