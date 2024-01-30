package com.examen.blancaramirez.models;

public class Hijo {
    private Long id;
    private String nombre;
    private Persona padre;

    // Constructor
    public Hijo(Long id, String nombre, Persona padre) {
        this.id = id;
        this.nombre = nombre;
        this.padre = padre;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getPadre() {
        return padre;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }
}
