package br.com.encontresuamateria.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.encontresuamateria.basicas.Professor;
import br.com.encontresuamateria.colecaodedados.ColecaoProfessor;

@Service
public class CadastroProfessor implements InterfaceCadastroProfessor{
	@Autowired
	private ColecaoProfessor colecaoProfessor;

	@Override
	public Professor salvarProfessor(Professor entity) {
		return colecaoProfessor.save(entity);
	}

	@Override
	public List<Professor> procurarProfessorNome(String nome) {
		return colecaoProfessor.findByNomeContaining(nome);
	}

	@Override
	public List<Professor> listarProfessores() {
		return colecaoProfessor.findAll();
	}

	@Override
	public Professor procurarProfessorId(long id) {
		return colecaoProfessor.findById(id).orElse(null);
	}

	@Override
	public List<Professor> procurarProfessorEmail(String email) {
		return colecaoProfessor.findByEmailContaining(email);
	}

	@Override
	public List<Professor> procurarProfessorDisciplina(String disciplina) {
		return colecaoProfessor.findByDisciplinaContaining(disciplina);
	}
	

}
