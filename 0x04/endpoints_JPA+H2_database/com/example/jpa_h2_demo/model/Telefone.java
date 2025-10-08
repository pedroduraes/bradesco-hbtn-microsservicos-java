package com.example.jpa_h2_demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "Telefone")
public class Telefone {
	
	@Id
	private Long id;
	private int ddd;
	private long numero;
	
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	@JsonBackReference
	private Cliente cliente;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}

	

}
