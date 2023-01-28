package com.example.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.prueba.modelo.Automovil;
import com.example.demo.prueba.repo.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService {

	@Autowired
	private IAutomovilRepo automovilRepo;
	
	@Override
	public void agregar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepo.insertar(automovil);

	}

	@Override
	public Automovil buscarPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPlaca(placa);
	}

	@Override
	public Automovil buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarCedula(cedula);
	}

}
