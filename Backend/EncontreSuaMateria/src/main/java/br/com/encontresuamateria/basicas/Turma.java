package br.com.encontresuamateria.basicas;

import java.util.ArrayList;
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
	private Professor professor;
	private String disciplina;
	
	public Turma() {
        this.alunoMatriculado = new ArrayList<>();
    }
	
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
	
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	

    public void adicionarAluno(Aluno aluno) {
        this.alunoMatriculado.add(aluno);
    }
	
}
