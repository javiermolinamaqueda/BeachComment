package com.beachcomment.Beach.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "ciudad")
public class Ciudad {
    @Id
    @Column(name = "idciu")
    private long idCiu;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "habitantes")
    private long habitantes;
}
