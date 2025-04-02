package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="eastDir")
public class eastEntity {
    @Getter@Setter
    String eastState;
    @Getter@Setter
    String eastCentre;
}
