package br.edu.infnet.appcurso.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurso.model.domain.Pacote;
import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.model.repository.PacoteRepository;

@Service
public class PacoteService {

	@Autowired
	private PacoteRepository pacoteRepository;


	public Pacote incluir(Pacote pacote) {
		return pacoteRepository.save(pacote);
	}
	
	public void excluir(Integer key) {
		pacoteRepository.deleteById(key);
	}

	public Collection<Pacote> obterLista() {
		return (Collection<Pacote>) pacoteRepository.findAll();
	}

	public Collection<Pacote> obterLista(Usuario usuario) {
		return (Collection<Pacote>) pacoteRepository.obterLista(usuario.getId(), Sort.by(Direction.ASC, "descricao"));
	}

	public Pacote obterPorId(Integer id) {
		return pacoteRepository.findById(id).orElse(null);
	}
}
