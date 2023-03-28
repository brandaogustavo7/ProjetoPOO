package br.com.encontresuamateria.colecaodedados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.encontresuamateria.basicas.Experiencia;

@Repository
public interface ColecaoExperiencia extends JpaRepository<Experiencia, Long>{
	public List<Experiencia> findByEmpresaContaining(String empresa);
}
