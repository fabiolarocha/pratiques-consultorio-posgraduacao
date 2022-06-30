package com.agendamento.consultas.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private long cpf;

    @Column
    private String nome;

    @Column
    private long endereco;

    @Column
    private long telefone;

    @Column
    private Date dataNascimento;
}
