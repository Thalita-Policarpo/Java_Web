package br.edu.infnet.appcurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurso.model.domain.BancoDeDados;
import br.edu.infnet.appcurso.model.service.BancoDeDadosService;

@Component
public class BancoDeDadosLoader implements ApplicationRunner {

	@Autowired
	private BancoDeDadosService bancoDeDadosService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		for (int i = 0; i < 5; i++) {
			BancoDeDados bancoDeDados = new BancoDeDados("Banco de dados" + i, 560 + i, "SQL", false, true);

			bancoDeDadosService.incluir(bancoDeDados);

		}
		
	}

}
