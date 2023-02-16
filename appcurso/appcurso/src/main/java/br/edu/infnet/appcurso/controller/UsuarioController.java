package br.edu.infnet.appcurso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	private String msg = null;

	@GetMapping(value = "/usuario")
	public String telaCadastro() {
		return "usuario/cadastro";
	}

	@GetMapping(value = "/lista")
	public String telaLista(Model model) {

		model.addAttribute("usuarios", UsuarioRepository.obterLista());

		model.addAttribute("mensagem", msg);
		msg = null;

		return "usuario/lista";
	}



	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {

		UsuarioRepository.incluir(usuario);

		msg = "A inclusão do usuário " + usuario.getNome() + " foi realizada com sucesso!";

//		Collection<Usuario> lista = UsuarioRepository.obterLista();
//
//		System.out.println("Quantidade de uarios:" + lista.size());
//
//		for (Usuario user : lista) {
//			System.out.println("A inclusao do usuario " + user.getNome() + ", foi realizada com sucesso!");
//		}

		return "redirect:/lista";
	}

}
