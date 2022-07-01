package com.agendamento.consultas.repository;

import com.agendamento.consultas.entity.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository  extends JpaRepository<Consulta, Long> {


}