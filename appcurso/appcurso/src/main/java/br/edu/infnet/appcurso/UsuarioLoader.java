package br.edu.infnet.appcurso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuarioAdmin = new Usuario("Thalita Policarpo", "thalita@admin.com", "123456");
		usuarioAdmin.setGenero("feminino");
		usuarioAdmin.setNascimento("11-12-1993");

		usuarioService.incluir(usuarioAdmin);

		try {

			String arq = "usuario.txt";

			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);

				String linha = leitura.readLine();
				String[] campos = null;

				while (linha != null) {

					campos = linha.split(";");

					Usuario usuario = new Usuario(campos[0], campos[1], campos[2]);
					for (int i = 0; i < linha.length(); i++) {
						usuario.setId(i);
					}
					usuario.setGenero(campos[3]);
					usuario.setNascimento(campos[4]);

					usuarioService.incluir(usuario);

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
