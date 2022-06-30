package com.agendamento.consultas.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MedicoDTO {

    @JsonProperty("Id")
    private Long Id;

    @JsonProperty("crm")
    private Long crm;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("endereco")
    private String endereco;

    @JsonProperty("telefone")
    private String telefone;

    @JsonProperty("especialidade")
    private String especialidade;

}
