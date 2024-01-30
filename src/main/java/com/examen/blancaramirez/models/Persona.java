package com.examen.blancaramirez.models;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;

public class Persona {
    
    
    


    public Long getId() {
		return id;
	}






	public void setId(Long id) {
		this.id = id;
	}






	public String getNombre() {
		return nombre;
	}






	public void setNombre(String nombre) {
		this.nombre = nombre;
	}






	public String getApellidos() {
		return apellidos;
	}






	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}






	public int getAñoNacimiento() {
		return añoNacimiento;
	}






	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}






	public String getDireccion() {
		return direccion;
	}






	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}






	public String getTelefono() {
		return telefono;
	}






	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}






	public String getCorreo() {
		return correo;
	}






	public void setCorreo(String correo) {
		this.correo = correo;
	}






	public int getEdad() {
		return edad;
	}






	public void setEdad(int edad) {
		this.edad = edad;
	}






	public List<Hijo> getHijos() {
		return hijos;
	}






	public void setHijos(List<Hijo> hijos) {
		this.hijos = hijos;
	}






	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = false)
    private int añoNacimiento;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false, length = 10)
    private String telefono;

    @Column(nullable = false, unique = true)
    private String correo;

    @Transient
    private int edad;

    @OneToMany(mappedBy = "padreMadre", cascade = CascadeType.ALL)
    private List<Hijo> hijos;
    
    

    // Constructor
    public Persona(Long id, String nombre, List<Hijo> hijos) {
        this.id = id;
        this.nombre = nombre;
        this.hijos = hijos;
    }

 

	
	

	public static void main(String[] args) {
		SpringApplication.run(, args)
	}

}
