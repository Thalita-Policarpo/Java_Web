package br.edu.infnet.appcurso.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

@Entity
@Table(name = "Tabela_Curso")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomeCurso;
	private String descricao;
	private float valor;

	public Curso() {

	}

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

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
