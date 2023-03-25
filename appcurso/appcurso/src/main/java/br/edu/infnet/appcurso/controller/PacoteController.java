package br.edu.infnet.appcurso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcurso.model.domain.Pacote;
import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.model.service.PacoteService;

@Controller
public class PacoteController {

	@Autowired
	private PacoteService pacoteService;

	private String msg = null;

	@GetMapping(value = "/cadastro-pacote")
	public String TelaCadastroPacote() {

		return "pacote/cadastro-pacote";
	}

	@GetMapping(value = "/lista-pacote")
	public String telaListaPacote(Model model, @SessionAttribute("usuario") Usuario usuario) {

		model.addAttribute("pacotes", pacoteService.obterLista(usuario));

		model.addAttribute("mensagem", msg);
		msg = null;

		return "pacote/lista-pacote";
	}

	@PostMapping(value = "/pacote/incluir")
	public String incluir(Pacote pacote, @SessionAttribute("usuario") Usuario usuario) {

		pacote.setUsuario(usuario);

		pacoteService.incluir(pacote);

		msg = "A inclusão do pacote " + pacote.getDescricao() + " foi realizada com sucesso!";

		return "redirect:/lista-pacote";
	}

	@GetMapping(value = "/pacote/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Pacote pacote = pacoteService.obterPorId(id);

		pacoteService.excluir(id);

		msg = "A exclusão do pacote " + pacote.getDescricao() + " foi realizada com sucesso!";
		
		return "redirect:/lista-pacote";
	}
}
