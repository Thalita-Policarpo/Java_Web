package br.edu.infnet.appcurso.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurso.model.domain.BancoDeDados;

@Repository
public class BancoDeDadosRepository {
	private static Integer id = 1;

	private static Map<Integer, BancoDeDados> mapaBancoDeDados = new HashMap<Integer, BancoDeDados>();

	public boolean incluir(BancoDeDados bancoDeDados) {

		bancoDeDados.setId(id++);

		try {
			mapaBancoDeDados.put(bancoDeDados.getId(), bancoDeDados);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public BancoDeDados excluir(Integer key) {

		return mapaBancoDeDados.remove(key);
	}

	public Collection<BancoDeDados> obterLista() {
		return mapaBancoDeDados.values();
	}
}
