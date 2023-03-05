package br.edu.infnet.appcurso.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appcurso.model.domain.BancoDeDados;

public class BancoDeDadosRepository {
	private static Integer id = 1;

	private static Map<Integer, BancoDeDados> mapaBancoDeDados = new HashMap<Integer, BancoDeDados>();

	public static boolean incluir(BancoDeDados bancoDeDados) {

		bancoDeDados.setId(id++);

		try {
			mapaBancoDeDados.put(bancoDeDados.getId(), bancoDeDados);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static BancoDeDados excluir(Integer key) {

		return mapaBancoDeDados.remove(key);
	}

	public static Collection<BancoDeDados> obterLista() {
		return mapaBancoDeDados.values();
	}
}
