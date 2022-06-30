package com.agendamento.consultas.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PacienteDTO {

    @JsonProperty("Id")
    private Long Id;

    @JsonProperty("cpf")
    private Long cpf;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("endereco")
    private String endereco;

    @JsonProperty("telefone")
    private String telefone;

    @JsonProperty("dataNascimento")
    private String dataNascimento;
}
