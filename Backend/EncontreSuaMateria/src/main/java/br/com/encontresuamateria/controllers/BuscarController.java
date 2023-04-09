package br.com.encontresuamateria.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import br.com.encontresuamateria.basicas.Aluno;
import br.com.encontresuamateria.basicas.Professor;
import br.com.encontresuamateria.fachada.EncontreSuaMateria;

@RestController
public class BuscarController {
	private EncontreSuaMateria encontre;
	@GetMapping(value = "/buscar/todos")
	public ResponseEntity<List<Professor>> listarprofessores(){
		return ResponseEntity.ok(encontre.listarTodosProfessores());
	}
	@GetMapping(value = "/buscar/todos/alufanos")
	public ResponseEntity<List<Aluno>> listarAluno(){
		return ResponseEntity.ok(encontre.listarTodosAlunos());
	}


	
}
