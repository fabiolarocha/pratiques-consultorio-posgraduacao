package com.agendamento.consultas.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private Long crm;

    @Column
    private String nome;

    @Column
    private String endereco;

    @Column
    private String telefone;

    @Column
    private String especialidade;

}
