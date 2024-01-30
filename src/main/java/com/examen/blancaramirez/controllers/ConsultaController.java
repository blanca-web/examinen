package com.examen.blancaramirez.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.blancaramirez.services.ConsultaService;

//Controlador Consulta

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.examen.blancaramirez.services.*;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
    private final ConsultaService consultaService;

    public ConsultaController(ConsultaService consultaService) {
        this.consultaService = consultaService;
    }

    @GetMapping("/{id}")
    public ConsultaController getConsultaById(@PathVariable Long id) {
        return ConsultaController.findById(id);
    }

    @GetMapping
    public List<ConsultaController> getAllConsultas() {
        return consultaService.findAll();
    }

    @GetMapping("/paciente/{pacienteId}")
    public List<ConsultaController> getConsultasByPaciente(@PathVariable Long pacienteId) {
        return ConsultaController.findByPaciente(pacienteId);
    }

    @PostMapping
    public ConsultaController saveConsulta(@RequestBody ConsultaController consulta) {
        return consultaService.saveConsulta(consulta);
    }

    @DeleteMapping("/{id}")
    public void deleteConsulta(@PathVariable Long id) {
        consultaService.deleteConsulta(id);
    }
}
