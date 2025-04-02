package com.example.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="WEST_STATES")
public class westEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="WEST_ID")
    int id;

    @Column(name="WEST_STATE")
    String westState;

    @Column(name="WEST_SERVICE")
    String westCentre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
