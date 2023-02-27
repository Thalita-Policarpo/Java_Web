package br.edu.infnet.appcurso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping(value = "/")
	public String telaIndex() {
		return "index";
	}

	@GetMapping(value = "/home")
	public String telaHome() {
		return "index";
	}



	@GetMapping(value = "/curso-banco-de-dados")
	public String TelaBancoDados() {

		return "curso-banco-de-dados/home-banco-dados";
	}

	@GetMapping(value = "/curso-programacao")
	public String TelaProgramacao() {

		return "curso-programacao/home-programacao";
	}
}
