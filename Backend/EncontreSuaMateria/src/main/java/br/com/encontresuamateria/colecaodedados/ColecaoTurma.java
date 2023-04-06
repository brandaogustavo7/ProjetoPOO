package br.com.encontresuamateria.colecaodedados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.encontresuamateria.basicas.Disciplina;
import br.com.encontresuamateria.basicas.Professor;
import br.com.encontresuamateria.basicas.Turma;

@Repository
public interface ColecaoTurma extends JpaRepository<Turma, Long>{
	
	public List<Turma> findByProfessorContaining(Professor professor);
	public List<Turma> findByDisciplinaContaining(Disciplina disciplina);
}
