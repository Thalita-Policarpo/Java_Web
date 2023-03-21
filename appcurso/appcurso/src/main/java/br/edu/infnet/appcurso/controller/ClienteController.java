package br.edu.infnet.appcurso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcurso.model.domain.Cliente;
import br.edu.infnet.appcurso.model.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	private String msg = null;

	@GetMapping(value = "/home-cliente")
	public String TelaHomeCliente() {

		return "cliente/home-cliente";
	}

	@GetMapping(value = "/cadastro-cliente")
	public String TelaCadastroCliente() {

		return "cliente/cadastro-cliente";
	}

	@GetMapping(value = "/lista-cliente")
	public String telaListaCliente(Model model) {

		model.addAttribute("clientes", clienteService.obterLista());

		model.addAttribute("mensagem", msg);
		msg = null;

		return "cliente/lista-cliente";
	}

	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente) {

		clienteService.incluir(cliente);

		msg = "A inclusão do cliente " + cliente.getNome() + " foi realizada com sucesso!";

		return "redirect:/lista-cliente";

	}

	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		clienteService.excluir(id);

		msg = "A exclusão do cliente " + id + " foi realizada com sucesso!";
		
		return "redirect:/lista-cliente";
	}

}
