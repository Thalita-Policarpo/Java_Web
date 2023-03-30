package br.edu.infnet.appcurso.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurso.model.domain.Agile;
import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.model.repository.AgileRepository;

@Service
public class AgileService {

	@Autowired
	private AgileRepository agileRepository;


	public Agile incluir(Agile agile) {
		return agileRepository.save(agile);
	}
	
	public void excluir(Integer key) {
		agileRepository.deleteById(key);
	}

	public Collection<Agile> obterLista() {
		return (Collection<Agile>) agileRepository.findAll();
	}

	public Collection<Agile> obterLista(Usuario usuario) {
		return (Collection<Agile>) agileRepository.obterLista(usuario.getId(), Sort.by(Direction.ASC, "nomeCurso"));
	}

	public Agile obterPorId(Integer id) {
		return agileRepository.findById(id).orElse(null);
	}
}
