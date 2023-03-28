package br.com.encontresuamateria.basicas;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Aluno extends Conta{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String escolaridade;
	@OneToMany
	private List<Agendamento> agendamento;
	
	public Aluno () {}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getEscolaridade() {
		return this.escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	public List<Agendamento> getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(List<Agendamento> agendamento) {
		this.agendamento = agendamento;
	}
	
}
