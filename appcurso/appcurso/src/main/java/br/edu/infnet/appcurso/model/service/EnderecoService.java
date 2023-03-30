package br.edu.infnet.appcurso.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurso.clients.IEnderecoClient;
import br.edu.infnet.appcurso.model.domain.Endereco;

@Service
public class EnderecoService {

	@Autowired
	private IEnderecoClient enderecoClient;

	public Endereco buscaPorCep(String cep) {

		return enderecoClient.buscaPorCep(cep);
	}
}
