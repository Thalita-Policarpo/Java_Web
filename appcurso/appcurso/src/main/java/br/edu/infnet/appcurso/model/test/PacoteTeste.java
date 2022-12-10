package br.edu.infnet.appcurso.model.test;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appcurso.model.domain.BancoDeDados;
import br.edu.infnet.appcurso.model.domain.Cliente;
import br.edu.infnet.appcurso.model.domain.Curso;
import br.edu.infnet.appcurso.model.domain.Pacote;
import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public class PacoteTeste {

	public static void main(String[] args) {
		
		List<Curso> cursoP1 = new ArrayList<Curso>();
		List<Curso> cursoP2 = new ArrayList<Curso>();
		List<Curso> cursoP3 = new ArrayList<Curso>();
		List<Curso> cursoP4 = new ArrayList<Curso>();
		List<Curso> cursoP5 = new ArrayList<Curso>();
		
		try {
			BancoDeDados b1 = new BancoDeDados("Banco de dados", 800, 1, "SQL", true, true);
			cursoP1.add(b1);
			cursoP2.add(b1);
			cursoP3.add(b1);
			
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			BancoDeDados b2 = new BancoDeDados("Banco de dados", 800, 2, "NoSQL", false, false);
			cursoP2.add(b2);
			cursoP3.add(b2);
			
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			BancoDeDados b3 = new BancoDeDados("Banco de dados", 800, 3, "JSON", true , false);
			cursoP3.add(b3);
			cursoP2.add(b3);
			
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		
		
		try {
			BancoDeDados b4 = new BancoDeDados("Banco de dados", -800, 2, "NoSQL", false, false);
			cursoP4.add(b4);
			cursoP5.add(b4);
			
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			BancoDeDados b5 = new BancoDeDados("Banco de dados", 0, 3, "JSON", true , false);
			cursoP5.add(b5);
			
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		Cliente c1 = new Cliente("Zezinho", "123456789-00", 18);	
		Cliente c2 = new Cliente("Huguinho", "123456789-00", 21);
		Cliente c3 = new Cliente("Luizinho", "123456789-00", 28);
		Cliente c4 = new Cliente("felipinho", "123456789-00", 21);
		Cliente c5 = new Cliente("joaozinho", "123456789-00", 28);

				
		Pacote p1 = new Pacote();
		p1.setDescricao("Curso basico");
		p1.setCliente(c1);
		p1.setMobile(false);
		p1.setCursos(cursoP1);
		p1.imprimir();
		
				
		Pacote p2 = new Pacote();
		p2.setDescricao("Curso intermediario");
		p2.setCliente(c2);
		p2.setMobile(true);
		p2.setCursos(cursoP2);
		p2.imprimir();
		
		
		Pacote p3 = new Pacote();
		p3.setDescricao("Curso avancado");
		p3.setCliente(c3);
		p3.setMobile(true);
		p3.setCursos(cursoP3);
		p3.imprimir();

		
		Pacote p4 = new Pacote();
		p4.setDescricao("Curso intermediario");
		p4.setCliente(c4);
		p4.setMobile(true);
		p4.setCursos(cursoP4);
		p4.imprimir();
		
		
		Pacote p5 = new Pacote();
		p5.setDescricao("Curso avancado");
		p5.setCliente(c5);
		p5.setMobile(true);
		p5.setCursos(cursoP5);
		p5.imprimir();
		
	}
}

