package com.example.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="EAST_STATES")
public class EastEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EAST_ID")
    int id;

    @Column(name="EAST_STATE")
    String eastState;

    @Column(name="EAST_SERVICE")
    String eastCentre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
