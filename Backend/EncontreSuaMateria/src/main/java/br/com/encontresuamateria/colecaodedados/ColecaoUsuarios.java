package br.com.encontresuamateria.colecaodedados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.encontresuamateria.basicas.Usuario;

public interface ColecaoUsuarios extends JpaRepository<Usuario, Long>{
	
	public List<Usuario> findByNomeContaining(String usuario);
	

}