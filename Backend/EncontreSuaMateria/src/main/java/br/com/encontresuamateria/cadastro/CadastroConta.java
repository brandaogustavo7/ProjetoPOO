package br.com.encontresuamateria.cadastro;

import java.util.List;

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
	public List<Conta> procurarContaEmail(String email) {
		return colecaoConta.findByEmailContaining(email);
	}
	

}
