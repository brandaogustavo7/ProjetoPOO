package br.com.encontresuamateria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

//import br.com.encontresuamateria.fachada.EncontreSuaMateria;

@RestController
public class UsuarioController {
	@Autowired
	//private EncontreSuaMateria materia;
	//@PostMapping(Value = "/teste")
	//public ReponseEntity
	
	@GetMapping(value = "/test")
	public String boas() {
		return "Olá, Mundo!!";
	}
	//@PatchMapping(Value = "/test")

}
