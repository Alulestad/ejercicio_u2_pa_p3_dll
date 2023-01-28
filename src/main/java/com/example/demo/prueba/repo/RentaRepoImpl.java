package com.example.demo.prueba.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.prueba.modelo.Pago;
import com.example.demo.prueba.modelo.Renta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class RentaRepoImpl implements IRentaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Renta renta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(renta);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Renta aEliminar= this.entityManager.find(Renta.class, id);
		
		this.entityManager.remove(aEliminar);
	}

}
