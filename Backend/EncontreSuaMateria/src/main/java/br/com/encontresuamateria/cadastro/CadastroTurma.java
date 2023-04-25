package br.com.encontresuamateria.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.encontresuamateria.basicas.Disciplina;
import br.com.encontresuamateria.basicas.Professor;
import br.com.encontresuamateria.basicas.Turma;
import br.com.encontresuamateria.colecaodedados.ColecaoTurma;

@Service
public class CadastroTurma implements InterfaceCadastroTurma{
	
	@Autowired
	ColecaoTurma colecaoTurma;

	@Override
	public Turma procurarTurmaId(long id) {
		return colecaoTurma.findById(id).orElse(null);
	}


	@Override
	public List<Turma> procurarTurmaDisciplina(Disciplina disciplina) {
		return colecaoTurma.findByDisciplinaContaining(disciplina);
	}

	@Override
	public Turma salvarTurma(Turma t) {
		return colecaoTurma.save(t);
	}

	@Override
	public void deletarTurma(Turma t) {
		colecaoTurma.delete(t);
		
	}

}
