package br.com.encontresuamateria.cadastro;

import java.util.List;

import br.com.encontresuamateria.basicas.Conta;

public interface InterfaceCadastroConta {
	
	Conta procurarContaId(long id);
	
	Conta procurarContaEmail(String email)throws ContaNaoExistenteException, ContaNaoExistenteException;

	Conta salvarConta(Conta c)throws ContaExistenteException;

	void deletarConta(Conta c);

	Conta atualizarConta(Conta c);
	

}
