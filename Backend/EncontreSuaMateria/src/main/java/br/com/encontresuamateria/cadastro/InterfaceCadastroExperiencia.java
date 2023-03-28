package br.com.encontresuamateria.cadastro;

import java.util.List;

import br.com.encontresuamateria.basicas.Experiencia;

public interface InterfaceCadastroExperiencia {
	
	Experiencia procurarExperienciaId(long id);
	
	List<Experiencia> procurarExperiencia(String empresa);
	
	Experiencia salvarExperiencia(Experiencia experiencia);
	
	void deletarExperiencia(Experiencia experiencia);
}
