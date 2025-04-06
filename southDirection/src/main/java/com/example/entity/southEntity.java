package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="southDir")
public class southEntity {
    String southState;
    String southCentre;

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
