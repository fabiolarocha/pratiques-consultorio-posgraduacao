package com.agendamento.consultas.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column
    private Date data;

    @Column
    private Date hora;

    @Column
    private String observacao;
}
