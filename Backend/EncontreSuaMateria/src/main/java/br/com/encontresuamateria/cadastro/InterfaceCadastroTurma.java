package br.com.encontresuamateria.cadastro;

import java.util.List;

import br.com.encontresuamateria.basicas.Disciplina;
import br.com.encontresuamateria.basicas.Professor;
import br.com.encontresuamateria.basicas.Turma;

public interface InterfaceCadastroTurma {
	
	Turma procurarTurmaId(long id);
	
	
	
	List<Turma> procurarTurmaDisciplina(Disciplina disciplina);
	
	Turma salvarTurma(Turma t);
	
	void deletarTurma(Turma t);
}
