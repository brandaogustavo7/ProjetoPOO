package br.com.encontresuamateria.basicas;

import jakarta.persistence.Entity;

@Entity
public class Aluno extends Conta{
	
	
	private String escolaridade;
	
	public Aluno () {}
	
	
	public String getEscolaridade() {
		return this.escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
}
