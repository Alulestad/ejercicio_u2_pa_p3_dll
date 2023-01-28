package com.example.demo.prueba.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.prueba.modelo.Pago;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class PagoRepoImpl implements IPagoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Pago pago) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pago);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Pago aEliminar= this.entityManager.find(Pago.class, id);
		
		this.entityManager.remove(aEliminar);
	}

}
