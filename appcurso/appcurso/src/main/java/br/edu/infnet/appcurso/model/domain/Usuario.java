package br.edu.infnet.appcurso.model.domain;

public class Usuario {

	private int id;
	private String nome;
	private String nascimento;
	private String genero;
	private String tipoUsuario;
	private String[] interesses;
	private String email;
	private String senha;

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

		return String.format("\nUsuario: %s " + "\nNascimento: %s" + "\nGenero: %s"
				+ "\nAcesso liberado como %s com interesses em %d cursos" + "\nCredenciais:" + "\nE-mail: %s"
				+ "\nSenha: %s.", nome, nascimento, genero, tipoUsuario, interesses.length, email, senha);
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

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String[] getInteresses() {
		return interesses;
	}

	public void setInteresses(String[] interesses) {
		this.interesses = interesses;
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

}
