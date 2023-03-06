package br.edu.infnet.appcurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurso.model.domain.Cliente;
import br.edu.infnet.appcurso.model.service.ClienteService;

@Component
public class ClienteLoader implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		for (int i = 0; i < 5; i++) {
			Cliente cliente = new Cliente("Thalita Policarpo" + i, "45" + i + ".32" + i + ".45" + i + "-6" + i,
					18 + i);

			clienteService.incluir(cliente);

		}
		
	}

}
