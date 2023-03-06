package br.edu.infnet.appcurso.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurso.model.domain.Programacao;

@Repository
public class ProgramacaoRepository {
	private static Integer id = 1;

	private static Map<Integer, Programacao> mapaProgramacao = new HashMap<Integer, Programacao>();

	public boolean incluir(Programacao programacao) {

		programacao.setId(id++);

		try {
			mapaProgramacao.put(programacao.getId(), programacao);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Programacao excluir(Integer key) {

		return mapaProgramacao.remove(key);
	}

	public Collection<Programacao> obterLista() {
		return mapaProgramacao.values();
	}
}
