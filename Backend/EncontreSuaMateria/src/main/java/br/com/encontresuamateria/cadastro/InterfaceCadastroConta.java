package br.com.encontresuamateria.cadastro;

import java.util.List;

import br.com.encontresuamateria.basicas.Conta;

public interface InterfaceCadastroConta {
	
	Conta procurarContaId(long id);
	
	List<Conta> procurarContaEmail(String email);
	

}
