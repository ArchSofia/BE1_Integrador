package com.example.integrador.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "Odontologos")

public final class Odontologo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private  String nombre;
    @Column
    private  String apellido;
    @Column
    private  String matricula;

    @OneToMany(mappedBy = "odontologo", fetch = FetchType.LAZY)
    private Set<Turno> turnos=new HashSet<>();


}

