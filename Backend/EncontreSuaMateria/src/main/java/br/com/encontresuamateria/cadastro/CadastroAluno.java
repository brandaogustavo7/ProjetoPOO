package br.com.encontresuamateria.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.encontresuamateria.basicas.Aluno;

import br.com.encontresuamateria.colecaodedados.ColecaoAluno;


@Service
public class CadastroAluno implements InterfaceCadastroAluno{
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

	@Override
	public List<Aluno> listarAlunos() {
		return colecaoAluno.findAll();
	}

	@Override
	public List<Aluno> procurarAlunoEmail(String email) {
		return null;
	}


}
