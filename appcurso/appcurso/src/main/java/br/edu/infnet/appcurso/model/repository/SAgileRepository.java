package br.edu.infnet.appcurso.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurso.model.domain.Agile;

@Repository
public class SAgileRepository {

	private static Integer id = 1;

	private static Map<Integer, Agile> mapaAgile = new HashMap<Integer, Agile>();

	public boolean incluir(Agile agile) {

		agile.setId(id++);

		try {
			mapaAgile.put(agile.getId(), agile);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Agile excluir(Integer key) {

		return mapaAgile.remove(key);
	}

	public Collection<Agile> obterLista() {
		return mapaAgile.values();
	}
}
