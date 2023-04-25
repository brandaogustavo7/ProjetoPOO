package br.com.encontresuamateria.cadastro;
import java.util.List;

import br.com.encontresuamateria.basicas.Professor;
public interface InterfaceCadastroProfessor{
	
	Professor salvarProfessor(Professor entity) throws ContaExistenteException;
	List<Professor> procurarProfessorNome(String nome);
	List<Professor> listarProfessores();
	Professor procurarProfessorId(long id);
	Professor procurarProfessorEmail(String email) throws ContaNaoExistenteException, ContaNaoExistenteException;
	List<Professor> procurarProfessorDisciplina(String disciplina);

}
