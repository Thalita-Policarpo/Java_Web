package br.edu.infnet.appcurso.model.test;

import br.edu.infnet.appcurso.model.domain.BancoDeDados;
import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public class BancoDeDadosTeste {
	public static void main(String[] args) {
		
		try {
			BancoDeDados b1 = new BancoDeDados("Banco de dados", 800, 1, "SQL", true, true);
			System.out.println(b1);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		
		try {
			BancoDeDados b2 = new BancoDeDados("Banco de dados", 600, 2, "NoSQL", false, false);
			System.out.println(b2);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		
		try {
			BancoDeDados b3 = new BancoDeDados("Banco de dados", 500, 3, "JSON", true , false);
			System.out.println(b3);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		

		try {
			BancoDeDados b2 = new BancoDeDados("Banco de dados", -600, 2, "NoSQL", false, false);
			System.out.println(b2);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		
		try {
			BancoDeDados b3 = new BancoDeDados("Banco de dados", 0, 3, "JSON", true , false);
			System.out.println(b3);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
	}
}
