package com.agendamento.consultas.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Paciente {

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column
    private long cpf;

    @Column
    private String nome;

    @Column
    private long endereco;

    @Column
    private String telefone;

    @Column
    private String dataNascimento;
}
