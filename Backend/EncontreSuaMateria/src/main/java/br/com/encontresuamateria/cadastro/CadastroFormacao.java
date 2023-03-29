package br.com.encontresuamateria.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.encontresuamateria.basicas.Formacao;
import br.com.encontresuamateria.colecaodedados.ColecaoFormacao;


@Service
public class CadastroFormacao implements InterfaceCadastroFormacao{
	
	@Autowired
	ColecaoFormacao colecaoFormacao;
	
	@Override
	public Formacao procurarFormacaoId(long id) {
		return colecaoFormacao.findById(id).orElse(null);
	}

	@Override
	public List<Formacao> procurarFormacao(String instituicao) {
		return colecaoFormacao.findByInstituicaoContaining(instituicao);
	}

	@Override
	public Formacao salvarFormacao(Formacao formacao) {
		return colecaoFormacao.save(formacao);
	}

	@Override
	public void deletarFormacao(Formacao formacao) {
		colecaoFormacao.delete(formacao);
	}
	
}
