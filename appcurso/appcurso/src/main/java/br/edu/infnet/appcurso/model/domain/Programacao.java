package br.edu.infnet.appcurso.model.domain;

public class Programacao extends Curso {
	private String linguagem;
	private String instituicao;
	private String bibliografia;
	
	
	public Programacao(String nomeCurso, float valor, int codigo, String linguagem, String instituição,
			String bibliografia) {
		super(nomeCurso, valor, codigo);
		this.linguagem = linguagem;
		this.instituicao = instituição;
		this.bibliografia = bibliografia;
	}


	@Override
	public String retornarMensagem() {
		
		return "O curso "  + getNomeCurso() + ", da instituicao " + getInstituicao() + " foi cadastrado!";
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(" ; ");
		sb.append(linguagem);
		sb.append(" ; ");
		sb.append(instituicao);
		sb.append(" ; ");
		sb.append(bibliografia);
		
		return sb.toString();
	}


	public String getLinguagem() {
		return linguagem;
	}


	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}


	public String getInstituicao() {
		return instituicao;
	}


	public void setInstituicao(String instituição) {
		this.instituicao = instituição;
	}


	public String getBibliografia() {
		return bibliografia;
	}


	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}	

}
