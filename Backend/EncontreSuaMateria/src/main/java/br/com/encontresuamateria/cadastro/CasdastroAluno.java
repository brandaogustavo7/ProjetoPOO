package br.com.encontresuamateria.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.encontresuamateria.basicas.Aluno;

import br.com.encontresuamateria.colecaodedados.ColecaoAluno;


@Service
public class CasdastroAluno implements InterfaceCadastroAluno{
	@Autowired
	private ColecaoAluno colecaoAluno;

	@Override
	public Aluno procurarAlunoId(long id) {
		colecaoAluno.findById(id);
		return null;
	}

	@Override
	public Aluno salvarAluno(Aluno entity) {
		return colecaoAluno.save(entity);
		
	}


}
