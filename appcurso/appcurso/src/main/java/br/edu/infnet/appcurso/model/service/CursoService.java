package br.edu.infnet.appcurso.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurso.model.domain.Curso;
import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.model.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;

	
	public void excluir(Integer key) {
		cursoRepository.deleteById(key);
	}

	public Collection<Curso> obterLista() {
		return (Collection<Curso>) cursoRepository.findAll();
	}

	public Collection<Curso> obterLista(Usuario usuario) {
		return (Collection<Curso>) cursoRepository.obterLista(usuario.getId());
	}

	public Curso obterPorId(Integer id) {
		return cursoRepository.findById(id).orElse(null);
	}
}
