package br.edu.infnet.appcurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurso.model.domain.Agile;
import br.edu.infnet.appcurso.model.service.AgileService;

@Component
public class AgileLoader implements ApplicationRunner {

	@Autowired
	private AgileService agileService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		for (int i = 0; i < 5; i++) {
			Agile agile = new Agile("Agile" + i, 350, "Agile", 1 + i, false);

			agileService.incluir(agile);

		}
		
	}

}
