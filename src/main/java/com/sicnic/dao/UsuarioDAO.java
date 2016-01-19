package com.sicnic.dao;

import java.util.List;

import com.sicnic.model.Usuarios;


public interface UsuarioDAO {

	  	public void addUsuarios(Usuarios p);
	    public void updateUsuarios(Usuarios p);
	    public List<Usuarios> listUsuarios();
	    public Usuarios getUsuariosById(String id);
	    public void removeUser(String id);
}
