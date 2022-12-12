package br.edu.infnet.appcurso.model.test;

import br.edu.infnet.appcurso.model.domain.Programacao;
import br.edu.infnet.appcurso.model.exceptions.DuracaoInvalidaException;
import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public class ProgramacaoTeste {

	public static void main(String[] args) {
	
		try {
			Programacao p1 = new Programacao("Java basico", 800, 1, "java", "Infnet", 1);
			System.out.println(p1);
			System.out.println(p1.retornarMensagem());
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
	
			
		try {
			Programacao p2 = new Programacao("Java intermediario", 900, 2, "java", "Infnet", 4);
			System.out.println(p2);
			System.out.println(p2.retornarMensagem());
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}

		
		try {
			Programacao p3 = new Programacao("Java intermediario", -900, 2, "java", "Infnet", 4);
			System.out.println(p3);
			System.out.println(p3.retornarMensagem());
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		
		
		
		try {
			Programacao p4 = new Programacao("Java avancado", 0, 3, "java", "Infnet", 3);
			System.out.println(p4);
			System.out.println(p4.retornarMensagem());
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		
		
		
		try {
			Programacao p5 = new Programacao("Java avancado", 100, 3, "java", "Infnet", 0);
			System.out.println(p5);
			System.out.println(p5.retornarMensagem());
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		
		
		
		try {
			Programacao p6 = new Programacao("Java avancado", 300, 3, "java", "Infnet", 50);
			System.out.println(p6);
			System.out.println(p6.retornarMensagem());
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		
		
		
	}
}
