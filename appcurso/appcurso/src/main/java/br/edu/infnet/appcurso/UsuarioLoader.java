package br.edu.infnet.appcurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.model.service.UsuarioService;

@Component
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		for (int i = 0; i < 5; i++) {
			Usuario usuario = new Usuario("Administrador" + i, "administrador" + i + "@adm.com", "123" + i);
			usuario.setId(i);
			usuario.setGenero("feminino");
			usuario.setNascimento("11-12-198" + i);

			usuarioService.incluir(usuario);

		}
		
	}

}
