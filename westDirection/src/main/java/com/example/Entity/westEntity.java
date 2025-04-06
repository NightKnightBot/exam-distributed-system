package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="westDir")
public class westEntity {
    String westState;
    String westCentre;

    public String getWestState() {
        return westState;
    }

    public void setWestState(String westState) {
        this.westState = westState;
    }

    public String getWestCentre() {
        return westCentre;
    }

    public void setWestCentre(String westCentre) {
        this.westCentre = westCentre;
    }
}
