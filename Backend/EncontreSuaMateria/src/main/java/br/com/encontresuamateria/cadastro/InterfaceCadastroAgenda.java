package br.com.encontresuamateria.cadastro;

import java.util.List;

import br.com.encontresuamateria.basicas.Agenda;

public interface InterfaceCadastroAgenda {
	
	Agenda procurarAgendaId(long id);
	
	List<Agenda> procurarAgenda(String diaSemana);
	
	Agenda salvarAgenda(Agenda agenda);
	
	void deletarAgenda(Agenda agenda);
}
