package br.com.encontresuamateria.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.encontresuamateria.basicas.Experiencia;
import br.com.encontresuamateria.colecaodedados.ColecaoExperiencia;

@Service
public class CadastroExperiencia implements InterfaceCadastroExperiencia{

	@Autowired
	ColecaoExperiencia colecaoExperiencia;
	
	@Override
	public Experiencia procurarExperienciaId(long id) {
		return colecaoExperiencia.findById(id).orElse(null);
	}

	@Override
	public List<Experiencia> procurarExperiencia(String empresa) {
		return colecaoExperiencia.findByNomeContaining(empresa);
	}

	@Override
	public Experiencia salvarExperiencia(Experiencia experiencia) {
		return colecaoExperiencia.save(experiencia);
	}

	@Override
	public void deletarExperiencia(Experiencia experiencia) {
		colecaoExperiencia.delete(experiencia);
	}

}
