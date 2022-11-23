package com.example.integrador.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Setter
@Getter
@Table(name = "Odontologos")

public final class Odontologo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private  String nombre;
    private  String apellido;
    private  String matricula;



}

