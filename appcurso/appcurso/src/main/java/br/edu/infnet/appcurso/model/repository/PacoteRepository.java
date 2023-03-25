package br.edu.infnet.appcurso.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurso.model.domain.Pacote;

@Repository
public interface PacoteRepository extends CrudRepository<Pacote, Integer> {
	@Query("from Pacote p where p.usuario.id = :userId")
	List<Pacote> obterLista(int userId);
}
