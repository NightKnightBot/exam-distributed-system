package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="westDir")
public class westEntity {

    @Getter@Setter
    String westState;
    @Getter@Setter
    String westCentre;
}
