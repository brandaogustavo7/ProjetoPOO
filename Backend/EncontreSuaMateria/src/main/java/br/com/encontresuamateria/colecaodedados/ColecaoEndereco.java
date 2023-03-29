package br.com.encontresuamateria.colecaodedados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.encontresuamateria.basicas.Endereco;

@Repository
public interface ColecaoEndereco extends JpaRepository<Endereco, Long>{
	
	public List<Endereco> findByNumeroContaining(int numero);
	
}
