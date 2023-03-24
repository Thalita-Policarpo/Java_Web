package br.edu.infnet.appcurso.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurso.model.domain.BancoDeDados;
import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.model.repository.BancoDeDadosRepository;

@Service
public class BancoDeDadosService {

	@Autowired
	private BancoDeDadosRepository bancoDeDadosRepository;


	public BancoDeDados incluir(BancoDeDados bancoDeDados) {
		return bancoDeDadosRepository.save(bancoDeDados);
	}
	
	public void excluir(Integer key) {
		bancoDeDadosRepository.deleteById(key);
	}

	public Collection<BancoDeDados> obterLista() {
		return (Collection<BancoDeDados>) bancoDeDadosRepository.findAll();
	}

	public Collection<BancoDeDados> obterLista(Usuario usuario) {
		return (Collection<BancoDeDados>) bancoDeDadosRepository.obterLista(usuario.getId());
	}

	public BancoDeDados obterPorId(Integer id) {
		return bancoDeDadosRepository.findById(id).orElse(null);
	}
}
