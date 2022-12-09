package br.edu.infnet.appcurso.model.test;

import br.edu.infnet.appcurso.model.domain.Agile;

public class AgileTeste {
	
	public static void main(String[] args) {
		
		Agile a1 = new Agile("Metodologia agil", 70, 1, "Kamban", "1 mes", false);
		System.out.println(a1);
		
		Agile a2 = new Agile("Programacao", 70, 1, "Java", "6 meses", true);
		System.out.println(a2);
		
		Agile a3 = new Agile("Banco de Dados", 70, 1, "JSON", "3 meses", true);
		System.out.println(a3);
	}
}
