package br.com.encontresuamateria.basicas;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToMany
	private List<Aluno> alunoMatriculado;

	@OneToOne
	private Disciplina disciplina;
	
	public Turma() {}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public List<Aluno> getAlunoMatriculado() {
		return alunoMatriculado;
	}
	public void setAlunoMatriculado(List<Aluno> alunoMatriculado) {
		this.alunoMatriculado = alunoMatriculado;
	}
	
	
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
}
