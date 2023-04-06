package br.com.encontresuamateria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.encontresuamateria.basicas.Professor;
import br.com.encontresuamateria.fachada.EncontreSuaMateria;

@RestController
public class CadastroController {
	@Autowired
	private EncontreSuaMateria encontre;
	 
	@PostMapping(value = "/home/cadastroprof")
	public ResponseEntity<Professor> cadastrarProfessor(@RequestBody Professor professor) {
		return ResponseEntity.ok(encontre.salvarProfessor(professor));
	}
	
	@PostMapping(value = "/home/cadastraraluno")
	public void cadastrarAluno() {
		
	}

}
