package br.com.encontresuamateria.basicas;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Professor extends Conta{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String disciplinas;
	private float valorHoraAula;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Formacao> formacao;
	@OneToOne
	private Agenda agenda;
	@OneToMany
	private List<Experiencia> experiencia;
	
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
