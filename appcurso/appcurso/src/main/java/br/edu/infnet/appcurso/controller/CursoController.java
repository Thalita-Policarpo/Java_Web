package br.edu.infnet.appcurso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursoController {

	@GetMapping(value = "/home-curso")
	public String TelaHomeCliente() {

		return "curso/home-curso";
	}
}
