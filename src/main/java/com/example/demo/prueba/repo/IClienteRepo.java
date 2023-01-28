package com.example.demo.prueba.repo;

import com.example.demo.prueba.modelo.Cliente;

public interface IClienteRepo {

	public void insertar(Cliente cliente);
	
	public Cliente buscarPlaca(String placa);
	public Cliente buscarCedula(String cedula);
}
