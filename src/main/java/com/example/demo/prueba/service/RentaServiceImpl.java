package com.example.demo.prueba.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.prueba.modelo.Renta;
import com.example.demo.prueba.repo.IPagoRepo;
import com.example.demo.prueba.repo.IRentaRepo;

@Service
public class RentaServiceImpl implements IRentaService {

	@Autowired
	private IRentaRepo iRentaRepo;
	
	@Autowired
	private IPagoRepo iPagoRepo;
	
	@Override
	public void agregar(Renta renta) {
		// TODO Auto-generated method stub
		
		BigDecimal valorPorDia= renta.getAutomovil().getValorPorDia();
		BigDecimal valorBruto=valorPorDia.multiply(new BigDecimal(renta.getNumeroDias()));
		renta.setValor(valorBruto);
		
		BigDecimal valorNeto=valorBruto.add(valorBruto.multiply(new BigDecimal(0.05)));
		renta.getPago().setValor(valorNeto);
		
		this.iRentaRepo.insertar(renta);
		//this.iPagoRepo.insertar(renta.getPago());
		
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iRentaRepo.eliminar(id);
	}

}
