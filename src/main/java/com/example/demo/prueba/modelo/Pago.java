package com.example.demo.prueba.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_pago")
	@SequenceGenerator(name="seq_pago",sequenceName = "seq_pago",allocationSize = 1)
	@Column(name = "pago_id")
	private Integer id;
	@Column(name = "pago_numeroTargeta")
	private String numeroTargeta;
	@Column(name = "pago_valor")
	private BigDecimal valor;
	
	
	@OneToOne(cascade = CascadeType.REMOVE)//(mappedBy = "pago1", fetch = FetchType.EAGER)
	@JoinColumn(name = "pago_id_renta")
	private Renta renta;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumeroTargeta() {
		return numeroTargeta;
	}


	public void setNumeroTargeta(String numeroTargeta) {
		this.numeroTargeta = numeroTargeta;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public Renta getRenta() {
		return renta;
	}


	public void setRenta(Renta renta) {
		this.renta = renta;
	}
	
	
}
