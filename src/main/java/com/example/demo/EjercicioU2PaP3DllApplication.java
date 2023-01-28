package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.prueba.modelo.Automovil;
import com.example.demo.prueba.modelo.Cliente;
import com.example.demo.prueba.modelo.Pago;
import com.example.demo.prueba.modelo.Renta;
import com.example.demo.prueba.service.IAutomovilService;
import com.example.demo.prueba.service.IClienteService;
import com.example.demo.prueba.service.IPagoService;
import com.example.demo.prueba.service.IRentaService;

@SpringBootApplication
public class EjercicioU2PaP3DllApplication implements CommandLineRunner{
	
	@Autowired
	private IAutomovilService automovilService;
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IPagoService iPagoService;
	@Autowired
	private IRentaService iRentaService;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3DllApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Cliente clie1= new Cliente();
		clie1.setCedula("12345344463");
		clie1.setNombre("Daniel");
		clie1.setRenta(null);
		
		Automovil auto1 = new Automovil();
		auto1.setPlaca("ABC13434432");
		auto1.setValorPorDia(new BigDecimal(20));
		auto1.setRenta(null);
		
		
		clienteService.agregar(clie1);
		automovilService.agregar(auto1);
		
		Renta renta1= new Renta();
		renta1.setFecha(LocalDateTime.now());
		renta1.setNumeroDias(2);
		renta1.setValor(null);
		renta1.setCliente(clie1);
		renta1.setAutomovil(auto1);
		renta1.setPago1(null);
		//s
		Pago pago1=new Pago();
		pago1.setNumeroTargeta("13213");
		pago1.setRenta(null);
		pago1.setValor(new BigDecimal(0));
		
		iRentaService.agregar(renta1);
		iPagoService.agregar(pago1);
		
		iRentaService.eliminar(3);
		//iPagoService.eliminar(2);
		
		
		System.out.println(automovilService.buscarPlaca("ABC132"));
		System.out.println(clienteService.buscarCedula("123456"));
		
		
		
		
		
		
	}

}
