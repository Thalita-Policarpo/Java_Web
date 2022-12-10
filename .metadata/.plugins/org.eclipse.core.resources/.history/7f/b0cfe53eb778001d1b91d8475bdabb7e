package br.edu.infnet.appcurso.model.domain;

import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public class Agile extends Curso {
	private String metodologia;
	private String duracao;
	private boolean presencial;
	
	
	public Agile(String nomeCurso, float valor, int codigo, String metodologia, String duracao, boolean presencial) throws ValorZeradoException {
		super(nomeCurso, valor, codigo);
		this.metodologia = metodologia;
		this.duracao = duracao;
		this.presencial = presencial;
	}


	@Override
	public String retornarMensagem() {
		
		return "O curso "  + getNomeCurso() + ", com duracao de " + getDuracao() + " foi cadastrado!";
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(" ; ");
		sb.append(metodologia);
		sb.append(" ; ");
		sb.append(duracao);
		sb.append(" ; ");
		sb.append(presencial ? "E presencial" : "Nao e presencial");
		

		return sb.toString();
	}
	

	public String getMetodologia() {
		return metodologia;
	}

	public void setMetodologia(String metodologia) {
		this.metodologia = metodologia;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public boolean isPresencial() {
		return presencial;
	}

	public void setPresencial(boolean presencial) {
		this.presencial = presencial;
	}
		
}
