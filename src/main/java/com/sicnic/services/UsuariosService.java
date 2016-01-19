package com.sicnic.services;

import java.util.List;

import com.sicnic.model.Usuarios;


public interface UsuariosService {

	 	public void addUser(Usuarios user);
	    public List<Usuarios> listuser();
	    public void removeUser(String user);
	    public Usuarios getUser(String id);
}
