package br.edu.infnet.appcurso.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	@GetMapping(value = "/usuario")
	public String telaCadastro() {

		return "usuario/cadastro";
	}

	@GetMapping(value = "/lista")
	public String telaLista() {

		return "lista/lista";
	}

	@GetMapping(value = "/home")
	public String telaHome() {
		return "home";
	}

	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {

		UsuarioRepository.incluir(usuario);

		List<Usuario> lista = UsuarioRepository.obterLista();

		System.out.println("Quantidade de uarios:" + lista.size());

		for (Usuario user : lista) {
			System.out.println("A inclusao do usuario " + user.getNome() + ", foi realizada com sucesso!");
		}

		return "redirect:/lista";
	}

}
