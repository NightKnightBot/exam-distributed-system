package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="NORTH_STATES")
public class NorthEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="NORTH_ID")
    int id;
    @Column(name="NORTH_STATE")
    String northState;
    @Column(name="NORTH_SERVICE")
    String northCentres;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNorthState() {
        return northState;
    }

    public void setNorthState(String northState) {
        this.northState = northState;
    }

    public String getNorthCentres() {
        return northCentres;
    }

    public void setNorthCentres(String northCentres) {
        this.northCentres = northCentres;
    }
}

