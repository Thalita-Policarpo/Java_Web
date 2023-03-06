package br.edu.infnet.appcurso.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurso.model.domain.Agile;
import br.edu.infnet.appcurso.model.repository.AgileRepository;

@Service
public class AgileService {

	@Autowired
	private AgileRepository agileRepository;


	public boolean incluir(Agile agile) {
		return agileRepository.incluir(agile);
	}
	
	public Agile excluir(Integer key) {

		return agileRepository.excluir(key);
	}

	public Collection<Agile> obterLista() {

		return agileRepository.obterLista();
	}
}
