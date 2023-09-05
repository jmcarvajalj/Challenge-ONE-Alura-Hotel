package com.latam.alura.hotel.test;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import com.latam.alura.hotel.dao.HuespedesDao;
import com.latam.alura.hotel.models.Huesped;
import com.latam.alura.hotel.utils.JPAUtils;


public class RegistroHuesped {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtils.getEntityManager();

		em.getTransaction().begin();
		
		HuespedesDao huespedDao = new HuespedesDao(em);

		List<Huesped> huespedes = huespedDao.consultaPorColumnas("Test");
		huespedes.forEach(prod -> System.out.println(prod.getApellido()));
		
		em.getTransaction().commit();
		em.close();		
	}
}
