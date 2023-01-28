package com.example.demo.prueba.repo;

import com.example.demo.prueba.modelo.Automovil;

public interface IAutomovilRepo {

	public void insertar(Automovil automovil);
	
	public Automovil buscarPlaca(String placa);
	
	public Automovil buscarCedula(String cedula);
}
