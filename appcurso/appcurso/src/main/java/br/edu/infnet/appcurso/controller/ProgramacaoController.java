package br.edu.infnet.appcurso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcurso.model.domain.Programacao;
import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.model.service.ProgramacaoService;

@Controller
public class ProgramacaoController {
	
	@Autowired
	private ProgramacaoService programacaoService;
	
	private String msg = null;

	@GetMapping(value = "/cadastro-programacao")
	public String TelaCadastroProgramacao() {

		return "curso-programacao/cadastro-programacao";
	}

	@GetMapping(value = "/lista-programacao")
	public String telaListaProgramacao(Model model, @SessionAttribute("usuario") Usuario usuario) {

		model.addAttribute("cursosProgramacao", programacaoService.obterLista(usuario));

		model.addAttribute("mensagem", msg);
		msg = null;

		return "curso-programacao/lista-programacao";
	}

	@PostMapping(value = "/programacao/incluir")
	public String incluir(Programacao programacao, @SessionAttribute("usuario") Usuario usuario) {

		programacao.setUsuario(usuario);

		programacaoService.incluir(programacao);

		msg = "A inclusão do curso " + programacao.getNomeCurso() + " foi realizada com sucesso!";

		return "redirect:/lista-programacao";

	}

	@GetMapping(value = "/cursosProgramacao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Programacao programacao = programacaoService.obterPorId(id);

		programacaoService.excluir(id);

		msg = "A exclusão do curso " + programacao.getNomeCurso() + " foi realizada com sucesso!";
		
		return "redirect:/lista-programacao";
	}

}
