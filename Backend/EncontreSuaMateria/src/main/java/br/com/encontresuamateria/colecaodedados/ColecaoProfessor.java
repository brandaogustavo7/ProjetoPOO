package br.com.encontresuamateria.colecaodedados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.encontresuamateria.basicas.Professor;

@Repository
public interface ColecaoProfessor extends JpaRepository<Professor, Long>{
	
	public List<Professor> findByNomeContaining(String nome);
	public Professor findByEmailContaining(String email);
	public List<Professor> findByDisciplinaContaining(String disciplina);

}
