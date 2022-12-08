package br.edu.infnet.appcurso.model.domain;

public class Cliente {
	private String nome;
	private String cpf;
	private int idade;
	
	
	
	public Cliente(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}


	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(" ; ");
		sb.append(cpf);
		sb.append(" ; ");
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
