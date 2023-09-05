package com.latam.alura.hotel.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {

	@Id
	private int Id;
	private String nombre;
	private String contrasena;
	
	public Usuarios() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getcontrasena() {
		return contrasena;
	}

	public void setcontrasena(String contrasena) {
		this.contrasena = contrasena;
	}
}
