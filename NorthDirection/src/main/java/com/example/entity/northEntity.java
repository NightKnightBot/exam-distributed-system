package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="northDir")
public class northEntity {

    @Getter
    @Setter
    String northState;

    @Getter
    @Setter
    String northCentres;

}
