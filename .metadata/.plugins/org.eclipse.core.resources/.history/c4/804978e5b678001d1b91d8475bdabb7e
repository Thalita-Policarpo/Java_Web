package br.edu.infnet.appcurso.model.test;

import br.edu.infnet.appcurso.model.domain.Agile;
import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public class AgileTeste {
	
	public static void main(String[] args) {
		
		try {
			Agile a1 = new Agile("Metodologia agil", 70, 1, "Kamban", "1 mes", false);
			System.out.println(a1);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {	
			Agile a2 = new Agile("Metodologia agil", 100, 2, "XP", "3 meses", true);
			System.out.println(a2);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	
	
		try {
			Agile a3 = new Agile("Metodologia agil", -90, 3, "Kamban", "1 meses", true);
			System.out.println(a3);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			Agile a4 = new Agile("Metodologia agil", 0, 4, "XP", "3 meses", true);
			System.out.println(a4);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

}

}
