package br.com.encontresuamateria.cadastro;
import java.util.List;

import br.com.encontresuamateria.basicas.Professor;
public interface InterfaceCadastroProfessor{
	
	Professor salvarProfessor(Professor entity);
	List<Professor> procurarProfessorNome(String nome);
	List<Professor> listarProfessores();
	

}
