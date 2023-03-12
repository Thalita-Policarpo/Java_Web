package br.edu.infnet.appcurso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
		
		try {

			String arq = "programacao.txt";

			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);

				String linha = leitura.readLine();
				String[] campos = null;

				while (linha != null) {

					campos = linha.split(";");

					Programacao programacao = new Programacao(campos[0], Integer.parseInt(campos[1]), campos[2],
							campos[3], campos[4], Integer.parseInt(campos[5]));

					programacaoService.incluir(programacao);

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
