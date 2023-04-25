package br.com.encontresuamateria.basicas;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Professor extends Conta{
	
	
	private String disciplina;
	
	private float valorHoraAula;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Formacao> formacao;
	@OneToOne(cascade = CascadeType.ALL)
	private Agenda agenda;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Experiencia> experiencia;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Turma> turma;
	
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
	

	public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	public List<Turma> getTurma() {
		return turma;
	}


	public void setTurma(List<Turma> turma) {
		this.turma = turma;
	}


	public void atualizarFormacao(Formacao entity) {
		this.formacao.add(entity);
	}
	
}
