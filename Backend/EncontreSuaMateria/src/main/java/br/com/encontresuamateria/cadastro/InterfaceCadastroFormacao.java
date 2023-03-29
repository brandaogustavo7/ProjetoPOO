package br.com.encontresuamateria.cadastro;

import java.util.List;

import br.com.encontresuamateria.basicas.Formacao;

public interface InterfaceCadastroFormacao {
	
	Formacao procurarFormacaoId(long id);
	
	List<Formacao> procurarFormacao(String instituicao);
	
	Formacao salvarFormacao(Formacao formacao);
	
	void deletarFormacao(Formacao formacao);
}
