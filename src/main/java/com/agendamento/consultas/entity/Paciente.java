package com.agendamento.consultas.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@RequiredArgsConstructor
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private Long cpf;
    @Column
    private String nome;
    @Column
    private String endereco;
    @Column
    private String telefone;
    @Column
    private String dataNascimento;
}
