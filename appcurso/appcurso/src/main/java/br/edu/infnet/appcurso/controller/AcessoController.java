package br.edu.infnet.appcurso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcurso.model.domain.Usuario;

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
		
		if (usuario.getEmail().equalsIgnoreCase(usuario.getSenha())) {
			
			return "home";
		}else {
			
			return "login/index";
		}
		
	}
}