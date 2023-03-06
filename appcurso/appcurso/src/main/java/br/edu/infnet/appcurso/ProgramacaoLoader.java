package br.edu.infnet.appcurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurso.model.domain.Programacao;
import br.edu.infnet.appcurso.model.service.ProgramacaoService;

@Component
public class ProgramacaoLoader implements ApplicationRunner {

	@Autowired
	private ProgramacaoService programacaoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		for (int i = 0; i < 5; i++) {
			Programacao programacao = new Programacao("Aprendendo Java" + i, 60 + i, "Java", "infnet", 2 + i);

			programacaoService.incluir(programacao);

		}
		
	}

}
