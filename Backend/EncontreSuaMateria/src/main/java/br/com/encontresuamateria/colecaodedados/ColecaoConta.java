package br.com.encontresuamateria.colecaodedados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.encontresuamateria.basicas.Conta;

public interface ColecaoConta extends JpaRepository<Conta, Long>{
	
	public List<Conta> findByNomeContaining(String email);

}
