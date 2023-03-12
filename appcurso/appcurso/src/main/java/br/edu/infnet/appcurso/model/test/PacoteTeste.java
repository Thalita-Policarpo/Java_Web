package br.edu.infnet.appcurso.model.test;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appcurso.model.domain.Agile;
import br.edu.infnet.appcurso.model.domain.BancoDeDados;
import br.edu.infnet.appcurso.model.domain.Cliente;
import br.edu.infnet.appcurso.model.domain.Curso;
import br.edu.infnet.appcurso.model.domain.Pacote;
import br.edu.infnet.appcurso.model.exceptions.DadosPessoaisNaoPreenchidosException;
import br.edu.infnet.appcurso.model.exceptions.DuracaoInvalidaException;
import br.edu.infnet.appcurso.model.exceptions.PacoteSemClienteException;
import br.edu.infnet.appcurso.model.exceptions.PacoteSemCursosException;
import br.edu.infnet.appcurso.model.exceptions.TipoNuloException;
import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public class PacoteTeste {

	public static void main(String[] args) {
		
		List<Curso> cursoP1 = new ArrayList<Curso>();
		List<Curso> cursoP2 = new ArrayList<Curso>();
		List<Curso> cursoP3 = new ArrayList<Curso>();
		List<Curso> cursoP4 = new ArrayList<Curso>();
		List<Curso> cursoP5 = new ArrayList<Curso>();
		List<Curso> cursoP6 = new ArrayList<Curso>();
		List<Curso> cursoP7 = new ArrayList<Curso>();
		List<Curso> cursoP8 = new ArrayList<Curso>();
		List<Curso> cursoP9 = new ArrayList<Curso>();
		
		try {
			BancoDeDados b1 = new BancoDeDados("SQL", 800, "descrição", "Banco de dados", true, true);
			cursoP1.add(b1);
			cursoP2.add(b1);
			cursoP3.add(b1);
		} catch (ValorZeradoException | TipoNuloException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			BancoDeDados b2 = new BancoDeDados("NoSQL", 800, "descrição", "Banco de dados", false, false);
			cursoP2.add(b2);
			cursoP3.add(b2);
		} catch (ValorZeradoException | TipoNuloException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			Agile a1 = new Agile("Kanbam", 500, "descrição", "metodologia Aigl", 3, false);
			cursoP3.add(a1);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			BancoDeDados b4 = new BancoDeDados("NoSQL", -800, "descrição", "Banco de dados", false, false);
			cursoP4.add(b4);
			cursoP5.add(b4);
		} catch (ValorZeradoException | TipoNuloException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			BancoDeDados b5 = new BancoDeDados("JSON", 0, "descrição", "Banco de dados", true, false);
			cursoP5.add(b5);
		} catch (ValorZeradoException | TipoNuloException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			BancoDeDados b6 = new BancoDeDados("NoSQL", 800, "descrição", "Banco de dados", false, false);
			cursoP7.add(b6);
			cursoP6.add(b6);
		} catch (ValorZeradoException | TipoNuloException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			BancoDeDados b7 = new BancoDeDados("JSON", 900, "descrição", "Banco de dados", true, false);
			cursoP6.add(b7);
			cursoP7.add(b7);
		} catch (ValorZeradoException | TipoNuloException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		

				
		try {
			Cliente c1 = new Cliente("Zezinho", "123456789-00", 18);
			Pacote p1 = new Pacote(c1, cursoP1);
			p1.setDescricao("Curso basico");
			p1.setMobile(false);
			p1.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException | PacoteSemClienteException | PacoteSemCursosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} 
		
				
		try {
			Cliente c2 = new Cliente("Huguinho", "123456789-00", 21);
			Pacote p2 = new Pacote(c2, cursoP2);
			p2.setDescricao("Curso intermediario");
			p2.setMobile(true);
			p2.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException | PacoteSemClienteException | PacoteSemCursosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			Cliente c3 = new Cliente("luizinho", "123456789-00", 21);
			Pacote p3 = new Pacote(c3, cursoP3);
			p3.setDescricao("Curso avancado");
			p3.setMobile(true);
			p3.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException | PacoteSemClienteException | PacoteSemCursosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		
		try {
			Cliente c4 = new Cliente("Hugo", "123456789-00", 28);
			Pacote p4 = new Pacote(c4, cursoP4);
			p4.setDescricao("Curso intermediario");
			p4.setMobile(true);
			p4.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException | PacoteSemClienteException | PacoteSemCursosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			Cliente c5 = new Cliente("Joao", "123456789-00", 30);
			Pacote p5 = new Pacote(c5, cursoP5);
			p5.setDescricao("Curso avancado");
			p5.setMobile(true);
			p5.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException | PacoteSemClienteException | PacoteSemCursosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		
		try {
			Cliente c6 = new Cliente("Pedro", null, 28);
			Pacote p6 = new Pacote(c6, cursoP6);
			p6.setDescricao("Curso intermediario");
			p6.setMobile(true);
			p6.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException | PacoteSemClienteException | PacoteSemCursosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			Cliente c7 = new Cliente(null, "123456789-00", 30);
			Pacote p7 = new Pacote(c7, cursoP7);
			p7.setDescricao("Curso avancado");
			p7.setMobile(true);
			p7.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException | PacoteSemClienteException | PacoteSemCursosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		

		try {
			Cliente c8 = new Cliente("maria", "123456789-00", 15);
			Pacote p8 = new Pacote(c8, cursoP8);
			p8.setDescricao("Curso avancado");
			p8.setMobile(true);
			p8.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException | PacoteSemClienteException | PacoteSemCursosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		
		try {
			
			Pacote p9 = new Pacote(null, cursoP9);
			p9.setDescricao("Curso avancado");
			p9.setMobile(true);
			p9.imprimir();
		} catch (PacoteSemClienteException | PacoteSemCursosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			Cliente c9 = new Cliente("maria", "123456789-00", 32);
			Pacote p9 = new Pacote(c9, null);
			p9.setDescricao("Curso avancado");
			p9.setMobile(true);
			p9.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException | PacoteSemClienteException | PacoteSemCursosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

	}
}

