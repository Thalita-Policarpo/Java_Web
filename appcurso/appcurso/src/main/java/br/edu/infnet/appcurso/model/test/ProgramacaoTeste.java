package br.edu.infnet.appcurso.model.test;

import br.edu.infnet.appcurso.model.domain.Programacao;
import br.edu.infnet.appcurso.model.exceptions.DuracaoInvalidaException;
import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public class ProgramacaoTeste {

	public static void main(String[] args) {
	
		try {
			Programacao p1 = new Programacao("Java basico", 800, "java", "Infnet", 1);
			System.out.println(p1);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
	
			
		try {
			Programacao p2 = new Programacao("Java intermediario", 900, "java", "Infnet", 4);
			System.out.println(p2);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}

		
		try {
			Programacao p3 = new Programacao("Java intermediario", -900, "java", "Infnet", 4);
			System.out.println(p3);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		
		
		
		try {
			Programacao p4 = new Programacao("Java avancado", 0, "java", "Infnet", 3);
			System.out.println(p4);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		
		
		
		try {
			Programacao p5 = new Programacao("Java avancado", 100, "java", "Infnet", 0);
			System.out.println(p5);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		
		
		
		try {
			Programacao p6 = new Programacao("Java avancado", 300, "java", "Infnet", 50);
			System.out.println(p6);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		
		
		
	}
}
