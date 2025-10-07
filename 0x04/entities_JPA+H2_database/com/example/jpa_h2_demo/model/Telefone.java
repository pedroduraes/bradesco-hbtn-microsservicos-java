package com.example.jpa_h2_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "Telefone")
public class Telefone {
	
	@Id
	private int id;
	private int ddd;
	private long numero;

	public int getId() {
		return id;
	}
	public void setId(int id) {
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
