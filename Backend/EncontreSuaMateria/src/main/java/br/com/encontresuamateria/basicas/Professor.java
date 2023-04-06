package br.com.encontresuamateria.basicas;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Professor extends Conta{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String disciplina;
	private float valorHoraAula;
	private List<Formacao> formacao;
	@OneToOne
	private Agenda agenda;
	private List<Experiencia> experiencia;
	
	public Professor () {}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
