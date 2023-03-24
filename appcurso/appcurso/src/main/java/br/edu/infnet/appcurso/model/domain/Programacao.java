package br.edu.infnet.appcurso.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.appcurso.model.exceptions.DuracaoInvalidaException;
import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

@Entity
@Table(name = "Tabela_Programacao")
public class Programacao extends Curso {

	private String linguagem;
	private String instituicao;
	private int duracao;

	public Programacao(String nomeCurso, float valor, String descricao, String linguagem, String instituição,
			int duracao)
			throws ValorZeradoException, DuracaoInvalidaException {
		super(nomeCurso, valor, descricao);

		if (duracao < 1) {
			throw new DuracaoInvalidaException("A duracao do curso nao pode ser inferior a 1h");
		}

		if (duracao > 40) {
			throw new DuracaoInvalidaException("A duracao do curso nao pode ser superior a 40h");
		}

		this.linguagem = linguagem;
		this.instituicao = instituição;
		this.duracao = duracao;
	}

	@Override
	public String retornarMensagem() {
		String tempo;
		if (getDuracao() == 1) {
			tempo = "h";
		} else {
			tempo = "hs";
		}
		return "O curso " + getNomeCurso() + ", com duracao de " + getDuracao() + tempo + ", foi cadastrado!";
	}

	@Override
	public String obterLinha() {
		return getNomeCurso() + ";" + getValor() + ";" + this.getLinguagem() + ";" + this.getInstituicao() + ";"
				+ this.getDuracao() + "\r\n";
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(linguagem);
		sb.append(";");
		sb.append(instituicao);
		sb.append(";");
		sb.append(duracao);

		return sb.toString() + "\r\n" + retornarMensagem();
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituição) {
		this.instituicao = instituição;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

}
