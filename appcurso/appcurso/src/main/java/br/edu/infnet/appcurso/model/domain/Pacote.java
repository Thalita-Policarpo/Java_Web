package br.edu.infnet.appcurso.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.edu.infnet.appcurso.model.exceptions.PacoteSemClienteException;
import br.edu.infnet.appcurso.model.exceptions.PacoteSemCursosException;

public class Pacote {
	private String descricao;
	private boolean mobile;
	private LocalDateTime data;
	private Cliente cliente;
	private List<Curso> cursos;

	public Pacote(Cliente cliente, List<Curso> cursos) throws PacoteSemClienteException, PacoteSemCursosException {

		if (cliente == null) {
			throw new PacoteSemClienteException("Nao ha cliente associado ao pacote");
		}

		if (cursos == null) {
			throw new PacoteSemCursosException("Nao ha curso associado ao pacote");
		}

		this.cliente = cliente;
		this.cursos = cursos;

		data = LocalDateTime.now();
	}

	public String obterLinha() {
		return this.getDescricao() + ";" + this.getCliente() + ";" + this.getCursos().size() + "\r\n";
	}

	@Override
	public String toString() {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		return String.format("%s;%s;%s", descricao,
				mobile ? " Pode ser acessado por dispositivo moblie" : " Nao pode ser acessado por dispositivo moblie ",
				data.format(formato));
	}

	public void imprimir() {
		System.out.println("\nCadastro " + toString());
		System.out.println("Solicitante: " + cliente);
		System.out.println("Quantidade: " + cursos.size());
		System.out.println("Cursos:");
		for (Curso c : cursos) {
			System.out.println("- " + c.getNomeCurso());
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isMobile() {
		return mobile;
	}

	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public LocalDateTime getData() {
		return data;
	}

}
