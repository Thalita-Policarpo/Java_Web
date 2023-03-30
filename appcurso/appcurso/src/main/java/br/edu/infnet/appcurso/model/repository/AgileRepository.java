package br.edu.infnet.appcurso.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurso.model.domain.Agile;

@Repository
public interface AgileRepository extends CrudRepository<Agile, Integer> {
	@Query("from Agile a where a.usuario.id = :userId")
	List<Agile> obterLista(Integer userId, Sort sort);
}
