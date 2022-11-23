package com.example.integrador.repository;

import com.example.integrador.model.Odontologo;
import com.example.integrador.model.Paciente;
import com.example.integrador.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoRepository extends JpaRepository< Turno, Integer> {
}
