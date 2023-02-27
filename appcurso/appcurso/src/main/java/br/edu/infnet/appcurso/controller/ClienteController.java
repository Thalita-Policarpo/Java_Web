package br.edu.infnet.appcurso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcurso.model.domain.Cliente;
import br.edu.infnet.appcurso.repository.ClienteRepository;

@Controller
public class ClienteController {

	private String msg = null;

	@GetMapping(value = "/home-cliente")
	public String TelaHomeCliente() {

		return "cliente/home-cliente";
	}

	@GetMapping(value = "/cadastro-cliente")
	public String TelaCadastroCliente() {

		return "cliente/cadastro-cliente";
	}

	@GetMapping(value = "/cliente-lista")
	public String telaListaCliente(Model model) {

		model.addAttribute("clientes", ClienteRepository.obterLista());

		model.addAttribute("mensagem", msg);
		msg = null;

		return "cliente/cliente-lista";
	}

	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente) {

		ClienteRepository.incluir(cliente);

		msg = "A inclusão do cliente " + cliente.getNome() + " foi realizada com sucesso!";

		return "redirect:/cliente-lista";

	}

	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Cliente cliente = ClienteRepository.excluir(id);

		msg = "A exclusão do cliente " + cliente.getNome() + " foi realizada com sucesso!";
		
		return "redirect:/cliente-lista";
	}

}
