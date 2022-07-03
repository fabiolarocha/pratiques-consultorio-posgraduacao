package com.agendamento.consultas.exception;
import javax.persistence.EntityExistsException;

    public class PacienteNaoEncontrado extends EntityExistsException {
        public PacienteNaoEncontrado(Long idCliente) {
        super(String.format("%s Paciente não encontrado", idCliente));
    }
}