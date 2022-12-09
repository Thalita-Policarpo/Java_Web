package br.edu.infnet.appcurso.model.test;

import br.edu.infnet.appcurso.model.domain.Programacao;

public class ProgramacaoTeste {

	public static void main(String[] args) {
		
		Programacao p1 = new Programacao("Java basico", 800, 1, "java", "Infnet", "Java como programar");
		System.out.println(p1);
		
		Programacao p2 = new Programacao("Java intermediario", 900, 1, "java", "Infnet", "Java como programar");
		System.out.println(p2);

		Programacao p3 = new Programacao("Java avancado", 1000, 1, "java", "Infnet", "Java como programar");
		System.out.println(p3);
		
	}
}
