package com.example.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.prueba.modelo.Pago;
import com.example.demo.prueba.repo.IPagoRepo;

@Service
public class PagoServiceImpl implements IPagoService {

	@Autowired
	private IPagoRepo iPagoRepo;
	
	@Override
	public void agregar(Pago pago) {
		// TODO Auto-generated method stub
		this.iPagoRepo.insertar(pago);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPagoRepo.eliminar(id);
	}

}
