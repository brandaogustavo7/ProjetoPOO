package br.com.encontresuamateria.controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.encontresuamateria.fachada.EncontreSuaMateria;





@RestController
public class CriarContaController {
	@Autowired
	private EncontreSuaMateria banco;
	
	
	@PostMapping(value = "conta")
	public void criarConta(@RequestBody EncontreSuaMateria banco, String email, String senha, String usuario){
		this.banco.criarConta(null, usuario, email, senha);
	}

}
