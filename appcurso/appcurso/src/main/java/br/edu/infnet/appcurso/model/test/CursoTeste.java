package br.edu.infnet.appcurso.model.test;

import br.edu.infnet.appcurso.model.domain.Curso;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Curso c1 = new Curso("kamban", 70, 1) {
			
			@Override
			public String retornarMensagem() {
				// TODO Auto-generated method stub
				return ". O curso de " + getNomeCurso() + " foi cadastrado com sucesso!";
			}
		};
		
		System.out.println(c1);
		
		
		
		
		Curso c2 = new Curso("Java", 1000, 2) {
			
			@Override
			public String retornarMensagem() {
				return ". O curso de " + getNomeCurso() + " foi cadastrado com sucesso!";
			}
		};
		
		System.out.println(c2);
		
		
		
		
		Curso c3 = new Curso("JSON", 500, 3) {
			
			@Override
			public String retornarMensagem() {
				
				return ". O curso de " + getNomeCurso() + " foi cadastrado com sucesso!";
			}
		};
		
		System.out.println(c3);
		
		
		
	}
}
