package br.edu.infnet.appcurso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcurso.model.domain.Programacao;
import br.edu.infnet.appcurso.model.repository.ProgramacaoRepository;

@Controller
public class ProgramacaoController {

	private String msg = null;

	@GetMapping(value = "/home-programacao")
	public String TelaProgramacao() {

		return "curso-programacao/home-programacao";
	}

	@GetMapping(value = "/cadastro-programacao")
	public String TelaCadastroProgramacao() {

		return "curso-programacao/cadastro-programacao";
	}

	@GetMapping(value = "/lista-programacao")
	public String telaListaProgramacao(Model model) {

		model.addAttribute("cursosProgramacao", ProgramacaoRepository.obterLista());

		model.addAttribute("mensagem", msg);
		msg = null;

		return "curso-programacao/lista-programacao";
	}

	@PostMapping(value = "/programacao/incluir")
	public String incluir(Programacao programacao) {

		ProgramacaoRepository.incluir(programacao);

		msg = "A inclusão do curso " + programacao.getNomeCurso() + " foi realizada com sucesso!";

		return "redirect:/lista-programacao";

	}

	@GetMapping(value = "/cursosProgramacao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Programacao programacao = ProgramacaoRepository.excluir(id);

		msg = "A exclusão do curso " + programacao.getNomeCurso() + " foi realizada com sucesso!";
		
		return "redirect:/lista-programacao";
	}

}
