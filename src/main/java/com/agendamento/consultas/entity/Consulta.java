package com.agendamento.consultas.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsulta;

    @Column
    private String paciente;

    @Column
    private String data;

    @Column
    private String hora;

    @Column
    private String medico;

    @Column
    private String observacao;
}
