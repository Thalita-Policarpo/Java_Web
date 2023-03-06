package br.edu.infnet.appcurso.model.domain;

import br.edu.infnet.appcurso.model.exceptions.DuracaoInvalidaException;
import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public class Agile extends Curso {

	private String metodologia;
	private int duracao;
	private boolean presencial;
	private String modalidade;

	public Agile(String nomeCurso, float valor, String metodologia, int duracao, boolean presencial)
			throws ValorZeradoException, DuracaoInvalidaException {
		super(nomeCurso, valor);

		if (duracao < 1) {
			throw new DuracaoInvalidaException("A duracao do curso nao pode ser inferior a 1 mes");
		}

		if (duracao > 6) {
			throw new DuracaoInvalidaException("A duracao do curso nao pode ser superior a 6 meses");
		}
		
		if (presencial) {
			modalidade = "Presencial";
		} else {
			modalidade = "online";
		}

		this.metodologia = metodologia;
		this.duracao = duracao;
		this.presencial = presencial;
	}

	@Override
	public String retornarMensagem() {
		String tempo;
		if (getDuracao() == 1) {
			tempo = " mes";
		} else {
			tempo = " meses";
		}
		return "O curso " + getNomeCurso() + ", com duracao de " + getDuracao() + tempo + ", foi cadastrado!";
	}

	@Override
	public String obterLinha() {
		return getNomeCurso() + ";" + getValor() + ";" + this.getMetodologia() + ";" + this.getDuracao() + ";"
				+ modalidade + "\r\n";

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(metodologia);
		sb.append(";");
		sb.append(duracao);
		sb.append(";");
		sb.append(presencial ? "É presencial" : "Nao é presencial");

		return sb.toString() + "\r\n" + retornarMensagem();
	}


	public String getMetodologia() {
		return metodologia;
	}

	public void setMetodologia(String metodologia) {
		this.metodologia = metodologia;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public boolean isPresencial() {
		return presencial;
	}

	public void setPresencial(boolean presencial) {
		this.presencial = presencial;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

}
