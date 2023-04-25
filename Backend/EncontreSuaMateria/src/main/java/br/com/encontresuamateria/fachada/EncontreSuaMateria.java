package br.com.encontresuamateria.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.encontresuamateria.basicas.Aluno;
import br.com.encontresuamateria.basicas.Conta;
import br.com.encontresuamateria.basicas.Professor;
import br.com.encontresuamateria.cadastro.ContaExistenteException;
import br.com.encontresuamateria.cadastro.ContaNaoExistenteException;
import br.com.encontresuamateria.cadastro.InterfaceCadastroAluno;
import br.com.encontresuamateria.cadastro.InterfaceCadastroConta;
import br.com.encontresuamateria.cadastro.InterfaceCadastroProfessor;

import br.com.encontresuamateria.basicas.Professor;

@Service
public class EncontreSuaMateria {
	

	@Autowired
	private InterfaceCadastroProfessor cadastroProfessor;
	@Autowired
	private InterfaceCadastroConta cadastroConta;
	@Autowired
	private InterfaceCadastroAluno cadastroAluno;
	
	public Conta procurarContaId(long id) {
		return cadastroConta.procurarContaId(id);
	}
	public void deletarConta(Conta c) {
		cadastroConta.deletarConta(c);
	}
	
	public Professor procurarProfessorId(long id) throws ContaNaoExistenteException{
		return cadastroProfessor.procurarProfessorId(id);
	}
	public Professor procurarProfessorEmail(String email) throws ContaNaoExistenteException{
		return cadastroProfessor.procurarProfessorEmail(email);
	}
	public List<Professor> listarTodosProfessores(){
		return cadastroProfessor.listarProfessores();
	}
	public List<Professor>procurarProfessorDisciplina(String disciplina){
		return cadastroProfessor.procurarProfessorDisciplina(disciplina);
	}
	
	public Professor criarContaProfessor(Professor entity) throws ContaExistenteException {
		return cadastroProfessor.salvarProfessor(entity);
	}
	
	public Aluno procurarAlunoId(long id) throws ContaNaoExistenteException {
		return cadastroAluno.procurarAlunoId(id);
	}
	public Aluno procurarAlunoEmail(String email) throws ContaNaoExistenteException {
		return (Aluno) cadastroAluno.procurarAlunoEmail(email);
	}
	
	public List<Aluno> listarTodosAlunos(){
		return cadastroAluno.listarAlunos();
	}
	public Aluno criarContaAluno(Aluno entity) throws ContaExistenteException{
		return cadastroAluno.salvarAluno(entity);
	}
	//criarachamadadoperfil
	
	
	
	
	

	
	

}
