package br.com.encontresuamateria.basicas;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String usuario;
	private String email;
	private String senha;
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String telefone;
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	@OneToOne
	private Conta conta;
	
	public Conta() {}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Conta getConta() {
		return this.conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public void criaConta(String usuario, String email, String senha) {
		
	}
	public void tipoContaProfessor() {}
	
	public void tipoContaAluno() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		if(senha.length() >= 8) {
			this.senha = senha;
	}else {
		System.out.println("Sua senha foi é invalida");}
	}


}
