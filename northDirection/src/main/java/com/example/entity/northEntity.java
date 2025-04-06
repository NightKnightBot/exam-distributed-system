package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="northDir")
public class northEntity {
    String northState;
    String northCentres;

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
