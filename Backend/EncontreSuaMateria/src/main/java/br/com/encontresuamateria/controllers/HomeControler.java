package br.com.encontresuamateria.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler {
	
	
	@GetMapping(value = "/home/login")
	public void login() {
		System.out.println("Test");
	}
	
	@GetMapping(value = "/home/novousuario")
	public void criarUsuario(){
		System.out.println();
	}
	

}
