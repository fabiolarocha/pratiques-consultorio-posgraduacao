package com.agendamento.consultas.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ConsultaDTO {

        @JsonProperty("Id")
        private Long id;

        @JsonProperty("nome")
        private String nome;

        @JsonProperty("data")
        private long data;

        @JsonProperty("hora")
        private String hora;

        @JsonProperty("medico")
        private String medico;

        @JsonProperty("observacao")
        private String observacao;
}
