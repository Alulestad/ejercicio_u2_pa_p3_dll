package com.example.demo.prueba.repo;

import com.example.demo.prueba.modelo.Pago;
import com.example.demo.prueba.modelo.Renta;

public interface IRentaRepo {

	public void insertar(Renta renta);
	
	public void eliminar(Integer id);
}
