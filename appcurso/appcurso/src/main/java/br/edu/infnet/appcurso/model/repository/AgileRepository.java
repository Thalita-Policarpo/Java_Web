package br.edu.infnet.appcurso.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appcurso.model.domain.Agile;

public class AgileRepository {

	private static Integer id = 1;

	private static Map<Integer, Agile> mapaAgile = new HashMap<Integer, Agile>();

	public static boolean incluir(Agile agile) {

		agile.setId(id++);

		try {
			mapaAgile.put(agile.getId(), agile);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static Agile excluir(Integer key) {

		return mapaAgile.remove(key);
	}

	public static Collection<Agile> obterLista() {
		return mapaAgile.values();
	}
}
