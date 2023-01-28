package com.example.demo.prueba.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.prueba.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ClienteRepoImpl implements IClienteRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	public Cliente buscarPlaca(String placa) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Cliente buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		Cliente encontrado= this.entityManager.find(Cliente.class, cedula);
		return encontrado;
	}

}
