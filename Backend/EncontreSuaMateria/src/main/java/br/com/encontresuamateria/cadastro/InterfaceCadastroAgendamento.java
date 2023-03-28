package br.com.encontresuamateria.cadastro;

import java.util.List;

import br.com.encontresuamateria.basicas.Agendamento;

public interface InterfaceCadastroAgendamento {
	
	Agendamento procurarAgendamentoId(long id);
	
	List<Agendamento> procurarAgendamento(String disciplina);
	
	Agendamento salvarAgendamento(Agendamento agendamento);
	
	void deletarAgendamento(Agendamento agendamento);
}
