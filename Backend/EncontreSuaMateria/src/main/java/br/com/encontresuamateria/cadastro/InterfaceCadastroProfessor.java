package br.com.encontresuamateria.cadastro;
import java.util.List;

import br.com.encontresuamateria.basicas.Professor;
public interface InterfaceCadastroProfessor{
	
	Professor salvarProfessor(Professor entity);
	List<Professor> procurarProfessorNome(String nome);
	List<Professor> listarProfessores();
	Professor procurarProfessorId(long id);
	List<Professor> procurarProfessorEmail(String email);
	List<Professor> procurarProfessorDisciplina(String disciplina);

}
