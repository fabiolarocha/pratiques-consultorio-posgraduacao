
package com.agendamento.consultas.mapper;

import com.agendamento.consultas.DTO.ConsultaDTO;
import com.agendamento.consultas.entity.Consulta;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConsultaMapper {
    ConsultaMapper INSTANCE = Mappers.getMapper(ConsultaMapper.class);
    Consulta toEntity(ConsultaDTO consultaDTO);
    @InheritInverseConfiguration
    ConsultaDTO toDTO(Consulta consulta);

}


