package br.edu.infnet.appcurso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacoteController {

	@GetMapping(value = "/home-pacote")
	public String TelaHomeCliente() {

		return "pacote/home-pacote";
	}
}
