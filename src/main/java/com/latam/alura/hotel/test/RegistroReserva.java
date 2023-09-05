package com.latam.alura.hotel.test;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.latam.alura.hotel.dao.HuespedesDao;
import com.latam.alura.hotel.dao.ReservasDao;
import com.latam.alura.hotel.models.Huesped;
import com.latam.alura.hotel.models.Reserva;
import com.latam.alura.hotel.utils.JPAUtils;

public class RegistroReserva {

	public static void main(String[] args) {
		
        EntityManager em = JPAUtils.getEntityManager();

        em.getTransaction().begin();

        ReservasDao reservasDao = new ReservasDao(em);

        List<Reserva> reservas = reservasDao.getAll();
        reservas.forEach(reserva -> System.out.println(reserva.getFormaPago()));
        em.getTransaction().commit();
        em.close();
	}
}
