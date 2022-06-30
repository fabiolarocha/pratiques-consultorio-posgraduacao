package com.agendamento.consultas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/agendamento")
@RestController
public class ConsultaController {

    @GetMapping
    public String get(){

        return "Olá Mundo";
        }
}
