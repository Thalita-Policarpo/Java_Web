package br.edu.infnet.appcurso.model.test;

import br.edu.infnet.appcurso.model.domain.Curso;
import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public class CursoTeste {

	public static void main(String[] args) {

		try {
			Curso c1 = new Curso("kamban", 70, "descrição") {

				@Override
				public String retornarMensagem() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public String obterLinha() {
					// TODO Auto-generated method stub
					return null;
				}
			};

			System.out.println(c1);

		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Curso c2 = new Curso("Java", 1000, "descrição") {

				@Override
				public String retornarMensagem() {
					return null;
				}

				@Override
				public String obterLinha() {
					// TODO Auto-generated method stub
					return null;
				}
			};

			System.out.println(c2);

		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Curso c3 = new Curso("JSON", 500, "descrição") {

				@Override
				public String retornarMensagem() {

					return null;
				}

				@Override
				public String obterLinha() {
					// TODO Auto-generated method stub
					return null;
				}
			};

			System.out.println(c3);

		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Curso c4 = new Curso("JSON", 0, "descrição") {

				@Override
				public String retornarMensagem() {

					return null;
				}

				@Override
				public String obterLinha() {
					// TODO Auto-generated method stub
					return null;
				}
			};

			System.out.println(c4);

		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Curso c5 = new Curso("JSON", -50, "descrição") {

				@Override
				public String retornarMensagem() {

					return ". O curso de " + getNomeCurso() + " foi cadastrado com sucesso!";
				}

				@Override
				public String obterLinha() {
					// TODO Auto-generated method stub
					return null;
				}
			};

			System.out.println(c5);

		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

	}
}
