package br.com.encontresuamateria.cadastro;

public class ContaExistenteException extends Exception{
	public ContaExistenteException() {
		super("Número da conta em uso!");
	}
}
