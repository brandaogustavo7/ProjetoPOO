package br.com.encontresuamateria.colecaodedados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.encontresuamateria.basicas.Agendamento;

@Repository
public interface ColecaoAgendamento extends JpaRepository<Agendamento, Long>{
	public List<Agendamento> findByNomeContaining(String disciplina);
}
