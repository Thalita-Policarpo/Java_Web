package br.edu.infnet.appcurso.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurso.model.domain.Cliente;
import br.edu.infnet.appcurso.model.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;


	public Cliente incluir(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public void excluir(Integer key) {
		clienteRepository.deleteById(key);
	}

	public Collection<Cliente> obterLista() {

		return (Collection<Cliente>) clienteRepository.findAll();
	}
}
