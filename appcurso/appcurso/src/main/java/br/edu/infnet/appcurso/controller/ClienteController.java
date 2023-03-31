package br.edu.infnet.appcurso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcurso.model.domain.Cliente;
import br.edu.infnet.appcurso.model.domain.Endereco;
import br.edu.infnet.appcurso.model.domain.Usuario;
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
	public String telaListaCliente(Model model, @SessionAttribute("usuario") Usuario usuario) {

		model.addAttribute("clientes", clienteService.obterLista(usuario));

		model.addAttribute("mensagem", msg);
		msg = null;

		return "cliente/lista-cliente";
	}

	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente, Endereco endereco, @SessionAttribute("usuario") Usuario usuario) {

		cliente.setUsuario(usuario);

		cliente.setEndereco(endereco);

		System.out.println("Bairro do cliente: " + cliente.getEndereco().getBairro());
		clienteService.incluir(cliente);

		msg = "A inclusão do cliente " + cliente.getNome() + " foi realizada com sucesso!";

		return "redirect:/lista-cliente";

	}

	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		try {
			clienteService.excluir(id);

			msg = "A exclusão do cliente " + id + " foi realizada com sucesso!";

		} catch (Exception e) {
			msg = "Impossível realizar a exclusão do curso " + id;
		}
		return "redirect:/lista-cliente";
	}

}
