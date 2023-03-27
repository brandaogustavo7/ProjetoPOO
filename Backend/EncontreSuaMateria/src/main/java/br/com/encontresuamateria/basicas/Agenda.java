package br.com.encontresuamateria.basicas;

public abstract class Agenda {
	
	private String diaSemana;
	private String turno;
	private int tempoAula;
	
	public Agenda() {}
	
	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getTempoAula() {
		return tempoAula;
	}

	public void setTempoAula(int tempoAula) {
		this.tempoAula = 60;
	}
	
}