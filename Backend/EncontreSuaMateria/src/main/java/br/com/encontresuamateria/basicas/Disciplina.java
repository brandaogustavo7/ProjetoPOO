package br.com.encontresuamateria.basicas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Disciplina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;

	public Disciplina(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public static final Disciplina PORTUGUES = new Disciplina ("Português");
	public static final Disciplina MATEMATICA = new Disciplina ("Matemática");
	public static final Disciplina HISTORIA = new Disciplina ("História");
	public static final Disciplina GEOGRAFIA = new Disciplina("Geografia");
    public static final Disciplina BIOLOGIA = new Disciplina("Biologia");
    public static final Disciplina FISICA = new Disciplina("Física");
    public static final Disciplina QUIMICA = new Disciplina("Química");
    public static final Disciplina ARTES = new Disciplina("Artes");
    public static final Disciplina EDUCACAOFISICA = new Disciplina("Educação Física");
    public static final Disciplina FILOSOFIA = new Disciplina("Filosofia");
    public static final Disciplina SOCIOLOGIA = new Disciplina("Sociologia");
    public static final Disciplina INGLES = new Disciplina("Inglês");


}
