package br.edu.infnet.appcurso.model.domain;

import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public class BancoDeDados extends Curso {
	private String tipo;
	private boolean exigencia;
	private boolean relacional;
	
	

	public BancoDeDados(String nomeCurso, float valor, int codigo, String tipo, boolean exigencia, boolean relacional) throws ValorZeradoException {
		super(nomeCurso, valor, codigo);
		this.tipo = tipo;
		this.exigencia = exigencia;
		this.relacional = relacional;
	}

	
	@Override
	public String retornarMensagem()  {
		
		return "O curso "  + getNomeCurso() + isExigencia();
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(" ; ");
		sb.append(tipo);
		sb.append(" ; ");
		sb.append(exigencia ? " Requer conhecimento previo " : " Nao requer conhecimento previo ");
		sb.append(" ; ");
		sb.append(relacional ? "Banco de dados relacional" : "Banco de dados nao relacional");
		
		return sb.toString();
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public boolean isExigencia() {
		return exigencia;
	}


	public void setExigencia(boolean exigencia) {
		this.exigencia = exigencia;
	}


	public boolean isRelacional() {
		return relacional;
	}


	public void setRelacional(boolean relacional) {
		this.relacional = relacional;
	}
	
}
