package com.example.demo.prueba.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.prueba.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class AutomovilRepoImpl implements IAutomovilRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.persist(automovil);
	}

	@Override
	public Automovil buscarPlaca(String placa) {
		// TODO Auto-generated method stub
		Automovil encontrado= this.entityManager.find(Automovil.class, placa);
		return encontrado;
	}

	@Override
	public Automovil buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

}
