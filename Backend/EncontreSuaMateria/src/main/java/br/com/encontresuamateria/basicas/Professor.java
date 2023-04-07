package br.com.encontresuamateria.basicas;

import java.util.List;

import jakarta.persistence.Entity;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Professor extends Conta{
	

	private String disciplina;
	private float valorHoraAula;
	@OneToMany
	private List<Formacao> formacao;
	@OneToOne
	private Agenda agenda;
	@OneToMany
	private List<Experiencia> experiencia;
	
	public Professor () {}
	

	public String getDisciplinas() {
		return disciplina;
	}
	public void setDisciplinas(String disciplinas) {
		this.disciplina = disciplinas;
	}
	
	public float getValorHoraAula() {
		return valorHoraAula;
	}
	public void setValorHoraAula(float valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}
	
	
	public List<Formacao> getFormacao() {
		return formacao;
	}
	public void setFormacao(List<Formacao> formacao) {
		this.formacao = formacao;
	}
	
	public Agenda getAgenda() {
		return agenda;
	}
	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	
	public List<Experiencia> getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(List<Experiencia> experiencia) {
		this.experiencia = experiencia;
	}


	
}
