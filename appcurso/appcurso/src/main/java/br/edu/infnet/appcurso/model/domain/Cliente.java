package br.edu.infnet.appcurso.model.domain;

import br.edu.infnet.appcurso.model.exceptions.DadosPessoaisNaoPreenchidosException;

public class Cliente {
	private String nome;
	private String cpf;
	private int idade;

	public Cliente(String nome, String cpf, int idade) throws DadosPessoaisNaoPreenchidosException {
		if (nome == null) {
			throw new DadosPessoaisNaoPreenchidosException("O nome precisa ser preenchido!");
		}

		if (cpf == null) {
			throw new DadosPessoaisNaoPreenchidosException("O cpf precisa ser preenchido!");
		}

		if (idade < 18) {
			throw new DadosPessoaisNaoPreenchidosException("A idade precisa ser a partir de 18 anos!");
		}

		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(cpf);
		sb.append(";");
		sb.append(idade);

		return sb.toString();
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

}
