package br.edu.infnet.appcurso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurso.model.domain.BancoDeDados;
import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.model.service.BancoDeDadosService;

@Order(4)
@Component
public class BancoDeDadosLoader implements ApplicationRunner {

	@Autowired
	private BancoDeDadosService bancoDeDadosService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {

			String arq = "bancoDeDados.txt";

			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);

				String linha = leitura.readLine();
				String[] campos = null;

				while (linha != null) {

					campos = linha.split(";");

					Usuario admin = new Usuario();
					admin.setId(1);

					BancoDeDados bancoDeDados = new BancoDeDados(campos[0], Float.parseFloat(campos[1]), campos[2],
							campos[3], Boolean.parseBoolean(campos[4]), Boolean.parseBoolean(campos[5]));

					bancoDeDados.setUsuario(admin);

					bancoDeDadosService.incluir(bancoDeDados);

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
