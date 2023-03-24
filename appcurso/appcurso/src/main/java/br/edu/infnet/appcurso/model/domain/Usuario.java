package br.edu.infnet.appcurso.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Tabela_Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String nascimento;
	private String genero;
	private String email;
	private String senha;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Cliente> clientes;


	public Usuario() {

	}

	public Usuario(String email, String senha) {
		this();
		this.setEmail(email);
		this.setSenha(senha);
	}

	public Usuario(String nome, String email, String senha) {
		this(email, senha);
		this.setNome(nome);
	}


	@Override
	public String toString() {

		return String.format("\nUsuario: %s " + "\nNascimento: %s" + "\nGenero: %s" + "\nCredenciais:" + "\nE-mail: %s"
				+ "\nSenha: %s.", nome, nascimento, genero, email, senha);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
