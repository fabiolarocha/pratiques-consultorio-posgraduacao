package com.agendamento.consultas.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ConsultaDTO {

        @JsonProperty("id_consulta")
        private Long idConsulta;

        @JsonProperty("paciente")
        private String paciente;

        @JsonProperty("data")
        private String data;

        @JsonProperty("hora")
        private String hora;

        @JsonProperty("medico")
        private String medico;

        @JsonProperty("observacao")
        private String observacao;
}
