package com.example.integrador.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Setter
@Getter
@Table(name = "Pacientes")

public final class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private  int id;
    private  String nombre;
    private  String apellido;
    private  String domicilio;
    private  String dni;
    private LocalDate fechaAlta;



}
