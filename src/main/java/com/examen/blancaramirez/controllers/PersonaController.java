package com.examen.blancaramirez.controllers;

import com.examen.blancaramirez.controllers.*;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    private final PersonaController personaController;

    public PersonaController(PersonaController personaController) {
        this.personaController = personaController;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonaController> obtenerPersonaPorId(@PathVariable Long id) {
        PersonaController persona = personaController.findById(id);
        if (personaController != null) {
            return ResponseEntity.ok(personaController);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<PersonaController>> obtenerTodasLasPersonas() {
        List<PersonaController> personas = personaController.findAll();
        if (!personas.isEmpty()) {
            return ResponseEntity.ok(personas);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping
    public ResponseEntity<PersonaController> crearPersona(@RequestBody PersonaController personaController) {
        PersonaController nuevaPersonaController = personaController.savePersona(personaController);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaPersonaController);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPersona(@PathVariable Long id) {
        PersonaController.deletePersona(id);
        return ResponseEntity.noContent().build();
    }
}
