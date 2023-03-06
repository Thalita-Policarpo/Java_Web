package br.edu.infnet.appcurso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcurso.model.domain.BancoDeDados;
import br.edu.infnet.appcurso.model.service.BancoDeDadosService;

@Controller
public class BancoDadosController {

	@Autowired
	private BancoDeDadosService bancoDeDadosService;

	private String msg = null;

	@GetMapping(value = "/home-banco-dados")
	public String TelaBancoDeDados() {

		return "curso-banco-de-dados/home-banco-dados";
	}

	@GetMapping(value = "/cadastro-banco-dados")
	public String TelaCadastroBancoDeDados() {

		return "curso-banco-de-dados/cadastro-banco-dados";
	}

	@GetMapping(value = "/lista-banco-dados")
	public String telaListaBancoDados(Model model) {

		model.addAttribute("cursosDados", bancoDeDadosService.obterLista());

		model.addAttribute("mensagem", msg);
		msg = null;

		return "curso-banco-de-dados/lista-banco-dados";
	}

	@PostMapping(value = "/banco-de-dados/incluir")
	public String incluir(BancoDeDados bancoDeDados) {

		bancoDeDadosService.incluir(bancoDeDados);

		msg = "A inclusão do curso " + bancoDeDados.getNomeCurso() + " foi realizada com sucesso!";

		return "redirect:/lista-banco-dados";

	}

	@GetMapping(value = "/cursosDados/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		BancoDeDados bancoDeDados = bancoDeDadosService.excluir(id);

		msg = "A exclusão do curso " + bancoDeDados.getNomeCurso() + " foi realizada com sucesso!";
		
		return "redirect:/lista-banco-dados";
	}

}
