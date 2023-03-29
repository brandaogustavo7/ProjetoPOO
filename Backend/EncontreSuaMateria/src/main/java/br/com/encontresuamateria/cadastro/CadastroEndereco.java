package br.com.encontresuamateria.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.encontresuamateria.basicas.Endereco;
import br.com.encontresuamateria.colecaodedados.ColecaoEndereco;

public class CadastroEndereco implements InterfaceCadastroEndereco{
	
	@Autowired
	private ColecaoEndereco colecaoEndereco;

	@Override
	public Endereco procurarEnderecoId(long id) {
		return colecaoEndereco.findById(id).orElse(null);
	}
	
	@Override
	public List<Endereco> procurarEnderecoNumero(int numero){
		return colecaoEndereco.findByNumeroContaining(numero);
	}

	@Override
	public Endereco salvarEndereco(Endereco Entity) {
		return colecaoEndereco.save(Entity);
	}

	@Override
	public void deletarEnderecoId(long id) {
		colecaoEndereco.deleteById(id);
	}

}
