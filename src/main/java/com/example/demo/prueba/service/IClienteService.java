package com.example.demo.prueba.service;

import com.example.demo.prueba.modelo.Cliente;

public interface IClienteService {

	public void agregar(Cliente cliente);
	
	public Cliente buscarPlaca(String placa);
	public Cliente buscarCedula(String cedula);
}
