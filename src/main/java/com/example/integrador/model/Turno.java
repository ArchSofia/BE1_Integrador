package com.example.integrador.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
@Entity
@Setter
@Getter
@Table(name = "Turnos")

public final class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private int id;
    private int iddontolgo;
    private int idPaciente;
    private LocalDate fecha;

}
