package br.edu.infnet.appcurso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.repository.AcessoRepository;

@Controller
public class AcessoController {

	@GetMapping(value = "/cadastrar-entrar")
	public String telaLogin() {
		return "login/index";
	}

	@GetMapping(value = "/sair")
	public String sair() {
		return "redirect:/";
	}

	@PostMapping(value = "/home")
	public String validarLogin(Usuario usuario) {

		if (AcessoRepository.autenticar(usuario) != null) {
			
			return "home";
		}else {
			
			return "login/index";
		}
		
	}
}
