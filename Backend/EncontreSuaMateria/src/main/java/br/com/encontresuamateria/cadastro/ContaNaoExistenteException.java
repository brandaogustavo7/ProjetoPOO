package br.com.encontresuamateria.cadastro;

public class ContaNaoExistenteException extends Exception{
	public ContaNaoExistenteException() {
		super("Conta não cadastrada!");
	}

}
