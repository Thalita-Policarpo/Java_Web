package br.edu.infnet.appcurso.model.domain;

import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public abstract class Curso {
	private int id;
	private String nomeCurso;
	private String descricao;
	private float valor;

	public Curso(String nomeCurso, float valor, String descricao) throws ValorZeradoException {

		if (valor < 0) {
			throw new ValorZeradoException("O valor do produto nao pode ser negativo!");
		}
		if (valor == 0) {
			throw new ValorZeradoException("O valor do produto nao pode ser 0 ");
		}

		this.nomeCurso = nomeCurso;
		this.valor = valor;
		this.descricao = descricao;
	}

	public abstract String obterLinha();

	public abstract String retornarMensagem();

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(nomeCurso);
		sb.append(";");
		sb.append(valor);
		sb.append(";");

		return sb.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public float getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}

}
