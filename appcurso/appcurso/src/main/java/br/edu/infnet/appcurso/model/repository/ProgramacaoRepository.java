package br.edu.infnet.appcurso.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurso.model.domain.Programacao;

@Repository
public interface ProgramacaoRepository extends CrudRepository<Programacao, Integer> {

}
