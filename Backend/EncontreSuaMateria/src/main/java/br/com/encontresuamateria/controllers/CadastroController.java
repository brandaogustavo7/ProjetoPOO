package br.com.encontresuamateria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.encontresuamateria.basicas.Aluno;
import br.com.encontresuamateria.basicas.Professor;
import br.com.encontresuamateria.cadastro.ContaExistenteException;
import br.com.encontresuamateria.fachada.EncontreSuaMateria;
@CrossOrigin (origins = "http://localhost:3000/" )
@RestController
public class CadastroController {
	@Autowired
	private EncontreSuaMateria encontre;
	 
	@PostMapping(value = "/home/cadastrarprof")
	public ResponseEntity<Professor> cadastrarProfessor(@RequestBody Professor professor) {
		try {
			encontre.criarContaProfessor(professor);
			return ResponseEntity.ok(professor);
		}catch (ContaExistenteException ex) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}
	@PostMapping(value = "/CadastroAluno")
	public ResponseEntity<Aluno> cadastrarAluno(@RequestBody Aluno aluno) {
		try {
			encontre.criarContaAluno(aluno);
			return ResponseEntity.ok(aluno);
		}catch (ContaExistenteException ex) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}
	
	
}
