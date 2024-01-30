package com.examen.blancaramirez.services;
import java.util.List;

public interface ConsultaService {
    
    ConsultaService findById(Long id);

    List<ConsultaService> findAll();

    List<ConsultaService> findByPaciente(Long pacienteId);

    ConsultaService saveConsulta(ConsultaService consulta);

    void deleteConsulta(Long id);
}



