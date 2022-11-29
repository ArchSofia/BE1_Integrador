package com.example.integrador.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "Odontologos")
@AllArgsConstructor
@NoArgsConstructor

public final class Odontologo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column
    private  String nombre;
    @Column
    private  String apellido;
    @Column
    private  String matricula;



}

