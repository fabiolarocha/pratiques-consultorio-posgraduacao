package com.agendamento.consultas.service;
import com.agendamento.consultas.DTO.ConsultaDTO;
import com.agendamento.consultas.entity.Consulta;
import com.agendamento.consultas.exception.PacienteNaoEncontrado;
import com.agendamento.consultas.mapper.ConsultaMapper;
import com.agendamento.consultas.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
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
    public ConsultaDTO getId(Long idConsulta) {
        Consulta buscar = verificarSeExiste(idConsulta);
        return consultaMapper.toDTO(buscar);
    }
    public List<ConsultaDTO> findAll() {
        return consultaRepository.findAll()
                .stream()
                .map(consultaMapper::toDTO)
                .collect(Collectors.toList());
    }
    public void deleteId(Long idConsulta) {
        Consulta buscar = verificarSeExiste(idConsulta);
        consultaRepository.deleteById(idConsulta);
    }

    public Consulta verificarSeExiste(Long idConsulta) {
        Consulta buscar = consultaRepository.findById(Long.valueOf(idConsulta))
                .orElseThrow(() -> new PacienteNaoEncontrado(idConsulta));
        return buscar;
    }
}