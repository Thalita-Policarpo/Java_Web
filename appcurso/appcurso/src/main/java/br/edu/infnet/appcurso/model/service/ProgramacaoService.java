package br.edu.infnet.appcurso.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurso.model.domain.Programacao;
import br.edu.infnet.appcurso.model.repository.ProgramacaoRepository;

@Service
public class ProgramacaoService {

	@Autowired
	private ProgramacaoRepository programacaoRepository;


	public boolean incluir(Programacao programacao) {
		return programacaoRepository.incluir(programacao);
	}
	
	public Programacao excluir(Integer key) {

		return programacaoRepository.excluir(key);
	}

	public Collection<Programacao> obterLista() {

		return programacaoRepository.obterLista();
	}
}
