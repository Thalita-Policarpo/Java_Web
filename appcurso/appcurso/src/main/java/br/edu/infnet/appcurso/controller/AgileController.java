package br.edu.infnet.appcurso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcurso.model.domain.Agile;
import br.edu.infnet.appcurso.repository.AgileRepository;

@Controller
public class AgileController {

	private String msg = null;

	@GetMapping(value = "/cadastro-agile")
	public String TelaAgile() {

		return "curso-agile/cadastro-agile";
	}

	@GetMapping(value = "/home-agile")
	public String telaLista(Model model) {

		model.addAttribute("cursos-agile", AgileRepository.obterLista());

		model.addAttribute("mensagem", msg);
		msg = null;

		return "curso-agile/home-agile";
	}

	@PostMapping(value = "/agile/incluir")
	public String incluir(Agile agile) {

		AgileRepository.incluir(agile);

		msg = "A inclusão do curso " + agile.getNomeCurso() + " foi realizada com sucesso!";

		return "redirect:/home-agile";

	}

	@GetMapping(value = "/agile/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Agile agile = AgileRepository.excluir(id);

		msg = "A exclusão do curso " + agile.getNomeCurso() + " foi realizada com sucesso!";
		
		return "redirect:/home-agile";
	}

}
