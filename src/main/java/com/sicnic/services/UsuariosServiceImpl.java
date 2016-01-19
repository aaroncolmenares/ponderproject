package com.sicnic.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sicnic.dao.UsuarioDAO;
import com.sicnic.model.Usuarios;

@Service
public class UsuariosServiceImpl  implements UsuariosService {
	
	
	private UsuarioDAO usuarioDAO;
	 
    public void setPersonDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }
   
    @Transactional
	@Override
	public void addUser(Usuarios user) {
    	 this.usuarioDAO.addUsuarios(user);		
	}

    @Transactional
	@Override
	public List<Usuarios> listuser() {    	 
         return usuarioDAO.listUsuarios();
	}

    @Transactional
	@Override
	public void removeUser(String user) {
    	this.usuarioDAO.removeUser(user);		
	}

    @Transactional
	@Override
	public Usuarios getUser(String id) {
		return this.usuarioDAO.getUsuariosById(id);
	}
}
