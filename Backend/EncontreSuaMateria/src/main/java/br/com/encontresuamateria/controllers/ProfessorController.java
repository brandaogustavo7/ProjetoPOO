package br.com.encontresuamateria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.encontresuamateria.basicas.Professor;
import br.com.encontresuamateria.fachada.EncontreSuaMateria;

@RestController
public class ProfessorController {
	@Autowired
	private EncontreSuaMateria encontreSuaMateria;
	@PostMapping(value = "/professor")
	public ResponseEntity<Professor> adicionarProfessor(@RequestBody Professor p){
		return ResponseEntity.ok(encontreSuaMateria.salvarProfessor(p));
	}

}
