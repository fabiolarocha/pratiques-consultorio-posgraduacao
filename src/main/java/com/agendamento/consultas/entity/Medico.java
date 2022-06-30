package com.agendamento.consultas.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Medico {

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private long crm;

    @Column
    private String nome;

    @Column
    private long endereco;

    @Column
    private long telefone;

    @Column
    private String especialidade;

}
