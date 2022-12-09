package br.edu.infnet.appcurso.model.domain;

public abstract class Curso {
	private String nomeCurso;
	private float valor;
	private int codigo;
	
	
	public Curso(String nomeCurso, float valor, int codigo) {
		this.nomeCurso = nomeCurso;
		this.valor = valor;
		this.codigo = codigo;
	}

	
	public abstract String retornarMensagem(); // retornar mesagem com as informações de cadastro
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(nomeCurso);
		sb.append(" ; ");
		sb.append(valor);
		sb.append(" ; ");
		sb.append(codigo);
		
		return sb.toString() + 
				retornarMensagem();
	}

	public String getNomeCurso() {
		return nomeCurso;
	}


	public float getValor() {
		return valor;
	}


	public int getCodigo() {
		return codigo;
	}

}
