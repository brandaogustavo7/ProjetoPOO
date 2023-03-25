package br.com.encontresuamateria.basicas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Professor extends Conta{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String disciplinas;
	private float valorHoraAula;
	private Formacao formacao;
	private Agenda agenda;
	private Experiencia experiencia;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public float getValorHoraAula() {
		return valorHoraAula;
	}
	public void setValorHoraAula(float valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}
	
	public Formacao getFormacao() {
		return formacao;
	}
	public void setFormacao(Formacao formacao) {
		this.formacao = formacao;
	}
	public Agenda getAgenda() {
		return agenda;
	}
	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	public Experiencia getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(Experiencia experiencia) {
		this.experiencia = experiencia;
	}
	
}
