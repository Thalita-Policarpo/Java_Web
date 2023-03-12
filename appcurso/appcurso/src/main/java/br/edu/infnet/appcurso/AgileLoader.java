package br.edu.infnet.appcurso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

		try {

			String arq = "agile.txt";

			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);

				String linha = leitura.readLine();
				String[] campos = null;

				while (linha != null) {

					campos = linha.split(";");

					Agile agile = new Agile(campos[0], Float.parseFloat(campos[1]), campos[2], campos[3],
							Integer.parseInt(campos[4]), Boolean.parseBoolean(campos[5]));

					agileService.incluir(agile);

					linha = leitura.readLine();
				}

				leitura.close();
				fileR.close();

			} catch (IOException e) {
				System.out.println("[ERRO]" + e.getMessage());

			}

		} finally {
			System.out.println("Processamento realizado!");
		}
	}
}
