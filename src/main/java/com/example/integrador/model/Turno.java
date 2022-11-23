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
    @Column
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "odontologo_id", nullable = false)
    private int iddontolgo;
    @Column
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id")
    private int idPaciente;
    @Column
    private LocalDate fecha;




}
