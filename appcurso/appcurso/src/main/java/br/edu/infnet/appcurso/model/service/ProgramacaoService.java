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


	public Programacao incluir(Programacao programacao) {
		return programacaoRepository.save(programacao);
	}
	
	public void excluir(Integer key) {
		programacaoRepository.deleteById(key);
	}

	public Collection<Programacao> obterLista() {
		return (Collection<Programacao>) programacaoRepository.findAll();
	}
	
	public Programacao obterPorId(Integer id) {
		return programacaoRepository.findById(id).orElse(null);
	}
}
