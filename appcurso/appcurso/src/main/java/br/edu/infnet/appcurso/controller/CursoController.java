package br.edu.infnet.appcurso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcurso.model.domain.Curso;
import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.model.service.CursoService;

@Controller
public class CursoController {

	@Autowired
	private CursoService cursoService;

	private String msg = null;

	@GetMapping(value = "/lista-curso")
	public String telaListaAgile(Model model, @SessionAttribute("usuario") Usuario usuario) {

		model.addAttribute("cursos", cursoService.obterLista(usuario));

		model.addAttribute("mensagem", msg);
		msg = null;

		return "curso/lista";
	}

	@GetMapping(value = "/curso/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Curso curso = cursoService.obterPorId(id);

		cursoService.excluir(id);

		msg = "A exclusão do curso " + curso.getNomeCurso() + " foi realizada com sucesso!";
		
		return "redirect:/lista-curso";
	}
}
