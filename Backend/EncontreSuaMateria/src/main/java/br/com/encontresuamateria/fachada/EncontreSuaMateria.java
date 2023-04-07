package br.com.encontresuamateria.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.encontresuamateria.basicas.Aluno;
import br.com.encontresuamateria.basicas.Conta;
import br.com.encontresuamateria.basicas.Professor;
import br.com.encontresuamateria.cadastro.InterfaceCadastroAluno;
import br.com.encontresuamateria.cadastro.InterfaceCadastroConta;
import br.com.encontresuamateria.cadastro.InterfaceCadastroProfessor;

//import br.com.encontresuamateria.basicas.Professor;

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
	public Professor criarContaProfessor(Professor entity) {
		return cadastroProfessor.salvarProfessor(entity);
	}
	public Aluno criarContaAluno(Aluno entity) {
		return cadastroAluno.salvarAluno(entity);
	}
	//criarachamadadoperfil
	public List<Professor> procurarProfessorNome(String nome) {
		return cadastroProfessor.procurarProfessorNome(nome);
		
	}
	public Conta salvarConta(Conta c) {
		return cadastroConta.salvarConta(c);
	}
	public void deletarConta(Conta c) {
		cadastroConta.deletarConta(c);
	}
	
	public void criarConta(Conta entity, String usuario, String email, String senha) {
		this.criarConta(entity, usuario, email, senha);
	}
	/* 
	public Professor encontrarProfessor(Professor professor) {
		return this.valor;
	}
	public void burcasPorPreco(float valor) {
		this.Usuario.valo
	}*/

}
