package com.example.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.prueba.modelo.Renta;
import com.example.demo.prueba.repo.IRentaRepo;

@Service
public class RentaServiceImpl implements IRentaService {

	@Autowired
	private IRentaRepo iRentaRepo;
	
	@Override
	public void agregar(Renta renta) {
		// TODO Auto-generated method stub
		this.iRentaRepo.insertar(renta);;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iRentaRepo.eliminar(id);
	}

}
