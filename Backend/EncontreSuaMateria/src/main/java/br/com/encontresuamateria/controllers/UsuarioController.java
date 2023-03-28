package br.com.encontresuamateria.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
	
	//@PostMapping(Value = "/teste")
	//public ReponseEntity
	
	@GetMapping(value = "/test")
	public String boas() {
		return "Olá, Mundo!!";
	}
	//@PatchMapping(Value = "/test")

}
