package com.agendamento.consultas.entity;

import javax.persistence.*;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String nome;

    @Column
    private String cpf;

    @Column
    private String logadouro;

    @Column
    private char sexo;

    @Column
    private int idade;
}
