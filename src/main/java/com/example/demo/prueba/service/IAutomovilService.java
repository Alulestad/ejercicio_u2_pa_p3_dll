package com.example.demo.prueba.service;

import com.example.demo.prueba.modelo.Automovil;

public interface IAutomovilService {
	
	public void agregar(Automovil automovil);
	
	public Automovil buscarPlaca(String placa);
	
	public Automovil buscarCedula(String cedula);
}
