package br.com.encontresuamateria.colecaodedados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.encontresuamateria.basicas.Formacao;

@Repository
public interface ColecaoFormacao extends JpaRepository<Formacao, Long>{
	
	public List<Formacao> findByInstituicaoContaining(String institucao);
	
}