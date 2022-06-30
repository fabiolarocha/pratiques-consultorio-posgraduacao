package com.agendamento.consultas.repository;

import com.agendamento.consultas.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository  extends JpaRepository<Paciente, Long> {


}