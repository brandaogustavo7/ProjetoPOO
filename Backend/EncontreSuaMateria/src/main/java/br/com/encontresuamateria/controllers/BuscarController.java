package br.com.encontresuamateria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.encontresuamateria.basicas.Aluno;
import br.com.encontresuamateria.basicas.Professor;
import br.com.encontresuamateria.cadastro.ContaExistenteException;
import br.com.encontresuamateria.cadastro.ContaNaoExistenteException;
import br.com.encontresuamateria.fachada.EncontreSuaMateria;
@CrossOrigin (origins = "http://localhost:3000/" )
@RestController
public class BuscarController {
	@Autowired
	private EncontreSuaMateria encontre;
	
	
	@GetMapping(value = "/buscar/todos")
	public ResponseEntity<List<Professor>> listarprofessor(){
		return ResponseEntity.ok(encontre.listarTodosProfessores());
	}
	
	@GetMapping(value = "/buscar/professor/{email}")
	public ResponseEntity<Professor> listarProfessor(@PathVariable String email) throws ContaNaoExistenteException{
		try {
			return ResponseEntity.ok(encontre.procurarProfessorEmail(email));
		}catch (ContaNaoExistenteException ex) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}
	@GetMapping(value = "/buscar/professor/test/{id}")
	public ResponseEntity<Professor> procurarProfessor(@PathVariable long Id) throws ContaNaoExistenteException{
		try {
			return ResponseEntity.ok(encontre.procurarProfessorId(Id));
		}catch (ContaNaoExistenteException ex) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value = "/buscar/todos/alunos")
	public ResponseEntity<List<Aluno>> listarAluno(){
		return ResponseEntity.ok(encontre.listarTodosAlunos());
	}
	@GetMapping(value = "/buscar/aluno/{email}")
	public ResponseEntity<Aluno> listarAluno(@PathVariable String email) throws ContaNaoExistenteException{
		try {
			return ResponseEntity.ok(encontre.procurarAlunoEmail(email));
		}catch(ContaNaoExistenteException ex){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
			
		}
	}
	@GetMapping(value = "/buscar/aluno/{id}")
	public ResponseEntity<Aluno> listarAluno(@PathVariable long id) throws ContaNaoExistenteException{
		try {
			return ResponseEntity.ok(encontre.procurarAlunoId(id));
		}catch(ContaNaoExistenteException ex) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}
}
