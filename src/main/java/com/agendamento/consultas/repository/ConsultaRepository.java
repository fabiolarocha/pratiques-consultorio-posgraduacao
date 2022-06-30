package com.agendamento.consultas.repository;

import com.agendamento.consultas.entity.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConsultaRepository  extends JpaRepository<Consulta, Long> {


}