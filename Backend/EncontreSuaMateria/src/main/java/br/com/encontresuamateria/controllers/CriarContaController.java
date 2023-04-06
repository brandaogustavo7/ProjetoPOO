package br.com.encontresuamateria.controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.encontresuamateria.basicas.Conta;
import br.com.encontresuamateria.cadastro.CadastroConta;
import br.com.encontresuamateria.fachada.EncontreSuaMateria;





@RestController
public class CriarContaController {
	@Autowired
	private EncontreSuaMateria banco;
	private CadastroConta t;
	
	
	//@PostMapping(value = "conta")
	//public void criarConta(@RequestBody EncontreSuaMateria banco, String email, String senha, String usuario){
	//	this.banco.criarConta(null, usuario, email, senha);
	//}
	@PostMapping(value = "/conta")
	public ResponseEntity<String> cadastrarConta(@RequestBody Conta c) {
			banco.salvarConta(c);
			return ResponseEntity.ok("OK");

}
	@PostMapping(value = "/newconta")
	public String criarConta(String usuario, String senha, String email) {
		Conta c = new Conta();
		//c.criarConta(dados.C usuario, senha, email);
		this.t.salvarConta(c);
		return "COnta criada";
		
	}
	
}
