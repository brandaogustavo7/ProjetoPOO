package br.com.encontresuamateria.basicas;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private List<Aluno> alunoMatriculado;
	private Professor professor;
	private Disciplina disciplina;
	
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
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
}
