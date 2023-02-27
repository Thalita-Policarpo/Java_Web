package br.edu.infnet.appcurso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcurso.model.domain.BancoDeDados;
import br.edu.infnet.appcurso.repository.BancoDeDadosRepository;

@Controller
public class BancoDadosController {

	private String msg = null;

	@GetMapping(value = "/home-banco-dados")
	public String TelaBancoDeDados() {

		return "curso-banco-de-dados/home-banco-dados";
	}

	@GetMapping(value = "/cadastro-banco-dados")
	public String TelaCadastroBancoDeDados() {

		return "curso-banco-de-dados/cadastro-banco-dados";
	}

	@GetMapping(value = "/banco-dados-lista")
	public String telaListaBancoDados(Model model) {

		model.addAttribute("cursosDados", BancoDeDadosRepository.obterLista());

		model.addAttribute("mensagem", msg);
		msg = null;

		return "curso-banco-de-dados/banco-dados-lista";
	}

	@PostMapping(value = "/banco-de-dados/incluir")
	public String incluir(BancoDeDados bancoDeDados) {

		BancoDeDadosRepository.incluir(bancoDeDados);

		msg = "A inclusão do curso " + bancoDeDados.getNomeCurso() + " foi realizada com sucesso!";

		return "redirect:/banco-dados-lista";

	}

	@GetMapping(value = "/cursosDados/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		BancoDeDados bancoDeDados = BancoDeDadosRepository.excluir(id);

		msg = "A exclusão do curso " + bancoDeDados.getNomeCurso() + " foi realizada com sucesso!";
		
		return "redirect:/banco-dados-lista";
	}

}
