package com.agendamento.consultas.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaDTO {

        @JsonProperty("Id")
        private Long id;

        @JsonProperty("data")
        private String data;

        @JsonProperty("hora")
        private String hora;

        @JsonProperty("observacao")
        private String observacao;
    }
}
