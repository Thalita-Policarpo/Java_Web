package br.edu.infnet.appcurso.model.test;

import br.edu.infnet.appcurso.model.domain.Cliente;
import br.edu.infnet.appcurso.model.exceptions.DadosPessoaisNaoPreenchidosException;

public class ClienteTeste {
	
	
	public static void main(String[] args) {
		
		try {
			Cliente c1 = new Cliente("Zezinho", "123456789-00", 18);
			System.out.println(c1);
		} catch (DadosPessoaisNaoPreenchidosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Cliente c2 = new Cliente("Huguinho", "123456789-00", 21);
			System.out.println(c2);
		} catch (DadosPessoaisNaoPreenchidosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Cliente c3 = new Cliente("Luizinho", "123456789-00", 35);
			System.out.println(c3);
		} catch (DadosPessoaisNaoPreenchidosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}	
		
	
	}
}
