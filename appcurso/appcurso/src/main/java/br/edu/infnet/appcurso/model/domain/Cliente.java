package br.edu.infnet.appcurso.model.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.infnet.appcurso.model.exceptions.DadosPessoaisNaoPreenchidosException;

@Entity
@Table(name = "Tabela_Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String cpf;
	private int idade;

	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idEndereco")
	private Endereco endereco;

	public Cliente() {

	}

	public Cliente(String nome, String cpf, int idade) throws DadosPessoaisNaoPreenchidosException {

		this();

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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setIdade(int idade) {
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


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
