package com.example.demo.prueba.repo;

import com.example.demo.prueba.modelo.Pago;

public interface IPagoRepo {

	public void insertar(Pago pago);
	
	public void eliminar(Integer id);
	
}
