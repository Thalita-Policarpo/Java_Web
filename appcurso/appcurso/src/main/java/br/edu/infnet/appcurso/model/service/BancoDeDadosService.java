package br.edu.infnet.appcurso.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurso.model.domain.BancoDeDados;
import br.edu.infnet.appcurso.model.repository.BancoDeDadosRepository;

@Service
public class BancoDeDadosService {

	@Autowired
	private BancoDeDadosRepository bancoDeDadosRepository;


	public boolean incluir(BancoDeDados bancoDeDados) {
		return bancoDeDadosRepository.incluir(bancoDeDados);
	}
	
	public BancoDeDados excluir(Integer key) {

		return bancoDeDadosRepository.excluir(key);
	}

	public Collection<BancoDeDados> obterLista() {

		return bancoDeDadosRepository.obterLista();
	}
}
