package br.com.encontresuamateria.colecaodedados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.encontresuamateria.basicas.Agenda;

@Repository
public interface ColecaoAgenda extends JpaRepository<Agenda, Long>{
	
	public List<Agenda> findByDiaSemanaContaining(String diaSemana);
}
