package com.sicnic.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.sicnic.model.Usuarios;


@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUsuarios(Usuarios user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);

	}

	@Override
	public void updateUsuarios(Usuarios user) {
		Session session = this.sessionFactory.getCurrentSession();
        session.update(user);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuarios> listUsuarios() {
		Session session = this.sessionFactory.getCurrentSession();
        List<Usuarios> usersList = session.createQuery("from Usuarios").list();
        return usersList;
	}

	@Override
	public Usuarios getUsuariosById(String id) {
		Session session = this.sessionFactory.getCurrentSession();      
        Usuarios user = (Usuarios) session.load(Usuarios.class, id);
        return user;
	}

	@Override
	public void removeUser(String id) {
		Session session = this.sessionFactory.getCurrentSession();
        Usuarios user = (Usuarios) session.load(Usuarios.class, id);
        if(null != user){
            session.delete(user);
        }
	}

}
