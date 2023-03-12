package br.edu.infnet.appcurso.model.test;

import br.edu.infnet.appcurso.model.domain.Agile;
import br.edu.infnet.appcurso.model.exceptions.DuracaoInvalidaException;
import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public class AgileTeste {
	
	public static void main(String[] args) {
		
		try {
			Agile a1 = new Agile("Conhecendo metodologia agil", 70, "descrição", "Kamban", 1, false);
			System.out.println(a1);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		
		try {	
			Agile a2 = new Agile("Estudando metodologia agil", 100, "descrição", "XP", 3, true);
			System.out.println(a2);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		
	
	
		try {
			Agile a3 = new Agile("Aprofundando em metodologia agil", -90, "descrição", "Kamban", 1, true);
			System.out.println(a3);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		
		
		
		try {
			Agile a4 = new Agile("Metodologia agil", 0, "descrição", "XP", 3, true);
			System.out.println(a4);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}

		
		
		try {
			Agile a3 = new Agile("Metodologia agil", 390, "descrição", "Kamban", 0, true);
			System.out.println(a3);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		
		
		
		try {
			Agile a4 = new Agile("Metodologia agil", 400, "descrição", "XP", 7, true);
			System.out.println(a4);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		

}

}
