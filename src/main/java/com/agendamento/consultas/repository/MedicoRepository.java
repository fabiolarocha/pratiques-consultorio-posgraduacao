package com.agendamento.consultas.repository;

import com.agendamento.consultas.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MedicoRepository extends JpaRepository<Medico, Long> {


}