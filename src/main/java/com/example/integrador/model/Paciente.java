package com.example.integrador.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "Pacientes")

public final class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    @Column
    private  String nombre;
    @Column
    private  String apellido;
    @Column
    private  String domicilio;
    @Column
    private  String dni;
    @Column
    private LocalDate fechaAlta;

    @JsonIgnore
    @OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)
    private Set<Turno> turnos=new HashSet<>();


}
