package br.edu.infnet.appcurso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping(value = "/")
	public String telaIndex() {
		return "template/template";
	}

	@GetMapping(value = "/home")
	public String telaHome() {
		return "home";
	}


}
