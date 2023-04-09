package br.com.encontresuamateria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.encontresuamateria.basicas.Aluno;
import br.com.encontresuamateria.basicas.Professor;
import br.com.encontresuamateria.cadastro.ContaExistenteException;
import br.com.encontresuamateria.fachada.EncontreSuaMateria;

@RestController
public class CadastroController {
	@Autowired
	private EncontreSuaMateria encontre;
	 
	@PostMapping(value = "/home/cadastrarprof")
	public ResponseEntity<Professor> cadastrarProfessor(@RequestBody Professor professor) throws ContaExistenteException {
		return ResponseEntity.ok(encontre.criarContaProfessor(professor));
	}
	@PostMapping(value = "/home/cadastraraluno")
	public ResponseEntity<String> cadastrarAluno(@RequestBody Aluno aluno) throws ContaExistenteException{
		//try {
			encontre.criarContaAluno(aluno);
			return ResponseEntity.ok("OK");
		//}//catch (ContaExistenteException e) {
			//return new ResponseEntity(HttpStatus.BAD_REQUEST);
		//}
	}
	
	
}
