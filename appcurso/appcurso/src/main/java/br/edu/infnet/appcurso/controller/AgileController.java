package br.edu.infnet.appcurso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcurso.model.domain.Agile;
import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.model.service.AgileService;

@Controller
public class AgileController {

	@Autowired
	private AgileService agileService;

	private String msg = null;

	@GetMapping(value = "/cadastro-agile")
	public String TelaCadastroAgile() {

		return "curso-agile/cadastro-agile";
	}

	@GetMapping(value = "/lista-agile")
	public String telaListaAgile(Model model, @SessionAttribute("usuario") Usuario usuario) {

		model.addAttribute("agiles", agileService.obterLista(usuario));

		model.addAttribute("mensagem", msg);
		msg = null;

		return "curso-agile/lista-agile";
	}

	@PostMapping(value = "/agile/incluir")
	public String incluir(Agile agile, @SessionAttribute("usuario") Usuario usuario) {

		agile.setUsuario(usuario);

		agileService.incluir(agile);

		msg = "A inclusão do curso " + agile.getNomeCurso() + " foi realizada com sucesso!";

		return "redirect:/lista-agile";
	}

	@GetMapping(value = "/agile/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Agile agile = agileService.obterPorId(id);

		agileService.excluir(id);

		msg = "A exclusão do curso " + agile.getNomeCurso() + " foi realizada com sucesso!";
		
		return "redirect:/lista-agile";
	}
}
