package br.edu.infnet.appcurso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.repository.AcessoRepository;

@Controller
public class AcessoController {

	@GetMapping(value = "/cadastrar-entrar")
	public String telaLogin() {
		return "login/login";
	}

	@GetMapping(value = "/sair")
	public String sair() {
		return "redirect:/";
	}
	
	@PostMapping(value = "/home")
	public String validarLogin(Model model, Usuario usuario) {

		if (AcessoRepository.autenticar(usuario) != null) {

			return "home";
		}

		model.addAttribute("mensagem",
				"As credendiais para o e-mail &ldquo; " + usuario.getEmail() + " &rdquo; estão incorretas!");

		return "login/login";
		
	}
}
