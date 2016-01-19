package com.sicnic.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuarios")
public class Usuarios {
	
	@Id
	private String user;
	private String password;
	private String nombre;
	private String role;
	
	public Usuarios() {
	}
	public Usuarios(String user, String password, String nombre, String role) {
		this.user = user;
		this.password = password;
		this.nombre = nombre;
		this.role=role;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Usuarios [user=" + user + ", password=" + password + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
