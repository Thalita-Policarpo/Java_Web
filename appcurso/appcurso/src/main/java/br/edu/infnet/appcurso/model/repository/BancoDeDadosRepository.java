package br.edu.infnet.appcurso.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurso.model.domain.BancoDeDados;

@Repository
public interface BancoDeDadosRepository extends CrudRepository<BancoDeDados, Integer> {
	@Query("from BancoDeDados b where b.usuario.id = :userId")
	List<BancoDeDados> obterLista(Integer userId, Sort sort);
}
