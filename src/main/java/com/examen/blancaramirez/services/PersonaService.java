package com.examen.blancaramirez.services;

import java.util.List;

public interface PersonaService {

    // Guardar una persona (base o subclase)
    PersonaService savePersona(PersonaService persona);

    // Obtener una persona (base o subclase) por su ID
    PersonaService getPersona(Long id);

    // Eliminar una persona (base o subclase) por su ID
    void deletePersona(Long id);

    // Obtener todas las personas (base o subclases)
    List<PersonaService> getAllPersonas();

    // Obtener todas las personas de un tipo específico
    List<PersonaService> getPersonasByType(String tipo);
}
