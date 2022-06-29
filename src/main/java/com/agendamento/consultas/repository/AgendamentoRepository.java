package com.agendamento.consultas.repository;

import com.agendamento.consultas.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository <Paciente , Long> {


}
