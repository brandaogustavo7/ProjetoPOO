package br.com.encontresuamateria.basicas;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Experiencia {
	
	private String cargo;
	private String empresa;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataInicio;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataFim;
	
	public Experiencia () {}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
		
}
