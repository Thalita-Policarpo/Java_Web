package br.edu.infnet.appcurso.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurso.model.domain.Programacao;

@Repository
public interface ProgramacaoRepository extends CrudRepository<Programacao, Integer> {
	@Query("from Programacao p where p.usuario.id = :userId")
	List<Programacao> obterLista(Integer userId);
}
