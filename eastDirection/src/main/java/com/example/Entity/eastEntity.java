package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="eastDir")
public class eastEntity {
    String eastState;
    String eastCentre;

    public String getEastState() {
        return eastState;
    }

    public void setEastState(String eastState) {
        this.eastState = eastState;
    }

    public String getEastCentre() {
        return eastCentre;
    }

    public void setEastCentre(String eastCentre) {
        this.eastCentre = eastCentre;
    }
}
