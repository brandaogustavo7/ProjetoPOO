package br.com.encontresuamateria.cadastro;

import java.util.List;

import br.com.encontresuamateria.basicas.Endereco;

public interface InterfaceCadastroEndereco {
	
	Endereco procurarEnderecoId(long id);
	
	List<Endereco> procurarEnderecoNumero(int numero);
	
	Endereco salvarEndereco(Endereco Entity);
	
	void deletarEnderecoId(long id);
	
}
