package com.agendamento.consultas.controller;

import com.agendamento.consultas.DTO.ConsultaDTO;
import com.agendamento.consultas.service.ConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamento")
@RequiredArgsConstructor
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConsultaDTO agendamento(@RequestBody ConsultaDTO consultaDTO) {
        return consultaService.agendamento(consultaDTO);
    }
    @GetMapping("/{id_cliente}")
    @ResponseStatus(HttpStatus.OK)
    public ConsultaDTO findById(@PathVariable("id_cliente") Long idCliente){
        return consultaService.getId(idCliente);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ConsultaDTO> findAll(){
        return consultaService.findAll();
    }
    @DeleteMapping("/{id_cliente}")
    public void deleteId(@PathVariable("id_cliente") Long idCliente){
        consultaService.deleteId(idCliente);
    }


}