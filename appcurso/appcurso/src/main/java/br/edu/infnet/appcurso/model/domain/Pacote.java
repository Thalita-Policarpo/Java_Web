package br.edu.infnet.appcurso.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.infnet.appcurso.model.exceptions.PacoteSemClienteException;
import br.edu.infnet.appcurso.model.exceptions.PacoteSemCursosException;

@Entity
@Table(name = "Tabela_Pedido")
public class Pacote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descricao;
	private boolean mobile;
	private LocalDateTime data;

	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idCliente")
	private Cliente cliente;

	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Curso> cursos;

	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;


	public Pacote() {

	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
