package com.examen.blancaramirez.repositories;

import java.util.List;

public interface PersonaRepository {

    // Guardar una persona
    PersonaRepository save(PersonaRepository personaRepository);

    // Encontrar una persona por su ID
    PersonaRepository findById(Long id);

    // Eliminar una persona por su ID
    void delete(Long id);

    // Encontrar todas las personas
    List<PersonaRepository> findAll();

    // Encontrar personas por su nombre
    List<PersonaRepository> findByNombre(String nombre);

    // Actualizar una persona existente
    PersonaRepository update(PersonaRepository persona);
}
