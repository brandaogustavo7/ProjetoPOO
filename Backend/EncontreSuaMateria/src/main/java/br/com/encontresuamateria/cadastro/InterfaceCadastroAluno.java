package br.com.encontresuamateria.cadastro;

import br.com.encontresuamateria.basicas.Aluno;


public interface InterfaceCadastroAluno {
	Aluno procurarAlunoId(long id);
	Aluno salvarAluno(Aluno entity);

}
