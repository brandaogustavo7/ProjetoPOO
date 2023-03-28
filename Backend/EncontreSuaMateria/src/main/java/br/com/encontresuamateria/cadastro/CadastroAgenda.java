package br.com.encontresuamateria.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.encontresuamateria.basicas.Agenda;
import br.com.encontresuamateria.colecaodedados.ColecaoAgenda;

@Service
public class CadastroAgenda implements InterfaceCadastroAgenda{

	@Autowired
	ColecaoAgenda colecaoAgenda;
	
	@Override
	public Agenda procurarAgendaId(long id) {
		return colecaoAgenda.findById(id).orElse(null);
	}

	@Override
	public List<Agenda> procurarAgenda(String diaSemana) {
		return colecaoAgenda.findByDiaSemanaContaining(diaSemana);
	}

	@Override
	public Agenda salvarAgenda(Agenda agenda) {
		return colecaoAgenda.save(agenda);
	}

	@Override
	public void deletarAgenda(Agenda agenda) {
		colecaoAgenda.delete(agenda);
	}
	
}
