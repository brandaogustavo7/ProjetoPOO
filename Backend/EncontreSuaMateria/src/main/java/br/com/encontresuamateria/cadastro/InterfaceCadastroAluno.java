package br.com.encontresuamateria.cadastro;

import java.util.List;

import br.com.encontresuamateria.basicas.Aluno;


public interface InterfaceCadastroAluno {
	Aluno procurarAlunoId(long id);
	Aluno salvarAluno(Aluno entity);
	List<Aluno> procurarAlunoEmail(String email);
	List<Aluno> listarAlunos();

}
