package br.edu.infnet.appcurso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcurso.model.domain.Usuario;

@Controller
public class UsuarioController {

//	@RequestMapping(value = "/usuario", method = RequestMethod.GET ) - pode ser feito dessa forma ou da forma seguinte
	@GetMapping(value = "/usuario")
	public String telaCadastro() {

		return "usuario/cadastro";
	}

	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
		System.out.println("Inclusao realizada com sucesso!!" + usuario);

		return "redirect:/";
	}
}