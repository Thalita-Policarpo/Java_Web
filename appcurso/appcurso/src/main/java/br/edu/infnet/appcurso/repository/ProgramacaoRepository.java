package br.edu.infnet.appcurso.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appcurso.model.domain.Programacao;

public class ProgramacaoRepository {
	private static Integer id = 1;

	private static Map<Integer, Programacao> mapaProgramacao = new HashMap<Integer, Programacao>();

	public static boolean incluir(Programacao programacao) {

		programacao.setId(id++);

		try {
			mapaProgramacao.put(programacao.getId(), programacao);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static Programacao excluir(Integer key) {

		return mapaProgramacao.remove(key);
	}

	public static Collection<Programacao> obterLista() {
		return mapaProgramacao.values();
	}
}
