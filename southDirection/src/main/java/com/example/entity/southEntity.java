package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="southDir")
public class southEntity {
    @Getter@Setter
    String southState;
    @Getter@Setter
    String southCentre;
}
