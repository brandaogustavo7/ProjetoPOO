package br.com.encontresuamateria.colecaodedados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.encontresuamateria.basicas.Conta;

@Repository
public interface ColecaoConta extends JpaRepository<Conta, Long>{
	
	public List<Conta> findByEmailContaining(String email);

}
