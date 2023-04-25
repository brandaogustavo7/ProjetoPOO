package br.com.encontresuamateria.cadastro;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.encontresuamateria.basicas.Conta;
import br.com.encontresuamateria.colecaodedados.ColecaoConta;

@Service
public class CadastroConta implements InterfaceCadastroConta{
	
	@Autowired
	ColecaoConta colecaoConta;
	
	@Override
	public Conta procurarContaId(long id) {
		return colecaoConta.findById(id).orElse(null);
	}
	
	@Override
	public Conta procurarContaEmail(String email) throws ContaNaoExistenteException {
		Conta c = colecaoConta.findByEmailContaining(email);
		if(c != null)
			return c;
		throw new ContaNaoExistenteException();
	}

	@Override
	public Conta salvarConta(Conta c) throws ContaExistenteException{
		try {
			procurarContaEmail(c.getEmail());
			throw new ContaExistenteException();
		}catch(ContaNaoExistenteException ex){
			return colecaoConta.save(c);
		}
	}
	


	@Override
	public void deletarConta(Conta c) {
		colecaoConta.delete(c);
	}

	@Override
	public Conta atualizarConta(Conta c) {
		return colecaoConta.save(c);

	}
	

}
