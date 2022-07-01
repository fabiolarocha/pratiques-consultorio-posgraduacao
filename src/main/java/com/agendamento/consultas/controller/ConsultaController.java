package com.agendamento.consultas.controller;

import com.agendamento.consultas.DTO.ConsultaDTO;
import com.agendamento.consultas.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/agendamento")
@RestController
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    public ConsultaDTO agendamento(ConsultaDTO consultaDTO) {
        return consultaService.agendamento(consultaDTO);
    }

}
