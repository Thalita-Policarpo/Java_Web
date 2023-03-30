package br.edu.infnet.appcurso.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurso.model.domain.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Integer> {
	@Query("from Curso c where c.usuario.id = :userId")
	List<Curso> obterLista(Integer userId, Sort sort);
}
