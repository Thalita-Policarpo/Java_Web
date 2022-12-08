package br.edu.infnet.appcurso.model.test;

import br.edu.infnet.appcurso.model.domain.Cliente;
import br.edu.infnet.appcurso.model.domain.Pacote;

public class PacoteTeste {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Zezinho", "123456789-00", 18);	
		
		Pacote p1 = new Pacote();
		p1.setDescricao("Curso basico");
		p1.setCliente(c1);
		p1.setMobile(false);
		System.out.println(p1);

		
		
		Cliente c2 = new Cliente("Huguinho", "123456789-00", 21);
		Pacote p2 = new Pacote();
		p2.setDescricao("Curso avancado");
		p2.setCliente(c2);
		p2.setMobile(true);
		System.out.println(p2);
		
	}
}

