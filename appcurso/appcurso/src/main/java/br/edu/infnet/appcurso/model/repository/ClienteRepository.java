package br.edu.infnet.appcurso.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurso.model.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	@Query("from Cliente c where c.usuario.id = :userId")
	List<Cliente> obterLista(int userId);
}
