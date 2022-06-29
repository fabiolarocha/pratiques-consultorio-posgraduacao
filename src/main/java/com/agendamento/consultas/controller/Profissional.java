package com.agendamento.consultas.controller;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
public class Profissional {

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private String nome;

    @Column
    private String cpf;

    @Column
    private String especialidade;

    @Column
    private int crm;
}
