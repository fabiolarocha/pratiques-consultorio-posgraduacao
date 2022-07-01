package com.agendamento.consultas.service;

import com.agendamento.consultas.DTO.ConsultaDTO;
import com.agendamento.consultas.entity.Consulta;
import com.agendamento.consultas.mapper.ConsultaMapper;
import com.agendamento.consultas.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {
    public final static ConsultaMapper consultaMapper = ConsultaMapper.INSTANCE;

    @Autowired
    public ConsultaRepository consultaRepository;

    public ConsultaDTO agendamento(ConsultaDTO consultaDTO) {
        Consulta criar = consultaMapper.toEntity(consultaDTO);
        Consulta salvar;
        salvar = consultaRepository.save(criar);

        return consultaMapper.toDTO(salvar);
    }
}
