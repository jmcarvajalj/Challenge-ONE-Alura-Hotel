package com.latam.alura.hotel.test;

import java.util.List;

import javax.persistence.EntityManager;

import com.latam.alura.hotel.dao.ReservasDao;
import com.latam.alura.hotel.dao.UsuariosDao;
import com.latam.alura.hotel.models.Reserva;
import com.latam.alura.hotel.models.Usuarios;
import com.latam.alura.hotel.utils.JPAUtils;

public class testUsuarios {

	public static void main(String[] args) {		// TODO Auto-generated method stub
		
		EntityManager em = JPAUtils.getEntityManager();

		em.getTransaction().begin();

		UsuariosDao usuariosDao = new UsuariosDao(em);

		// Create a new user instance
		Usuarios newUser = new Usuarios();
		
		//Crear Usuarios Nuevos
		newUser.setId(2);
		newUser.setNombre("testUser");
		newUser.setcontrasena("1234");

		// Save the new user with the hashed password
		usuariosDao.save(newUser);	
		em.getTransaction().commit();
		em.close();
	}
}
