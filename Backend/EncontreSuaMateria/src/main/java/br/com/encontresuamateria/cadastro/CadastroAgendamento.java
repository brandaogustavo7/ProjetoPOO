package br.com.encontresuamateria.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.encontresuamateria.basicas.Agendamento;
import br.com.encontresuamateria.colecaodedados.ColecaoAgendamento;

@Service
public class CadastroAgendamento implements InterfaceCadastroAgendamento{

	@Autowired
	ColecaoAgendamento colecaoAgendamento;
	
	@Override
	public Agendamento procurarAgendamentoId(long id) {
		return colecaoAgendamento.findById(id).orElse(null);
	}

	@Override
	public List<Agendamento> procurarAgendamento(String disciplina) {
		return colecaoAgendamento.findByNomeContaining(disciplina);
	}

	@Override
	public Agendamento salvarAgendamento(Agendamento agendamento) {
		return colecaoAgendamento.save(agendamento);
	}

	@Override
	public void deletarAgendamento(Agendamento agendamento) {
		colecaoAgendamento.delete(agendamento);
	}

}
