package br.edu.infnet.appcurso.model.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appcurso.model.domain.Agile;
import br.edu.infnet.appcurso.model.domain.BancoDeDados;
import br.edu.infnet.appcurso.model.domain.Cliente;
import br.edu.infnet.appcurso.model.domain.Curso;
import br.edu.infnet.appcurso.model.domain.Pacote;
import br.edu.infnet.appcurso.model.domain.PacoteSemCursosException;
import br.edu.infnet.appcurso.model.domain.Programacao;
import br.edu.infnet.appcurso.model.exceptions.DadosPessoaisNaoPreenchidosException;
import br.edu.infnet.appcurso.model.exceptions.DuracaoInvalidaException;
import br.edu.infnet.appcurso.model.exceptions.PacoteSemClienteException;
import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public class ArquivoTeste {

	public static void main(String[] args) {
		
		
		
		try {
			
			String arq = "pacotes.txt";			
			
			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);	
				
				FileWriter fileW = new FileWriter("out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);				
				
				String linha = leitura.readLine();
				String[] campos = null;
				
				List<Curso> curso = new ArrayList<Curso>();
				Pacote pacote = null;
				Agile agile  = null;
				BancoDeDados bancoDados = null;
				Programacao programacao = null;
				
				while (linha != null) {
					
					campos = linha.split(";");
					
					switch (campos[0].toUpperCase()) {
					case "PAC":
						
						try {
							Cliente cliente = new Cliente(campos[3], campos[4], Integer. parseInt(campos[5]));
							pacote = new Pacote(cliente, curso);
							pacote.setDescricao(campos[1]);
							pacote.setMobile(Boolean.valueOf(campos[2]));
						} catch (DadosPessoaisNaoPreenchidosException | PacoteSemClienteException | PacoteSemCursosException e) {
							System.out.println("[ERRO] " + e.getMessage());
						} 
						
						
						break;
					case "AGI": 
						
						try {
							agile  = new Agile(campos[1], Float.valueOf(campos[2]), Integer. parseInt(campos[3]), campos[4],Integer. parseInt(campos[5]) , Boolean.valueOf(campos[2]));
							curso.add(agile);
						} catch (ValorZeradoException | DuracaoInvalidaException e) {
							System.out.println("[ERRO] " + e.getMessage());
						} 
						
						break;
					case "BAN": 
						try {
							bancoDados = new BancoDeDados(campos[1], Float.valueOf(campos[2]), Integer. parseInt(campos[3]), campos[4], Boolean.valueOf(campos[5]),Boolean.valueOf(campos[6]));
							curso.add(bancoDados);
						} catch (ValorZeradoException e) {
							System.out.println("[ERRO] " + e.getMessage());
						}
						
						
						break;
					case "PRO": 
						try {
							programacao = new Programacao(campos[1], Float.valueOf(campos[2]), Integer. parseInt(campos[3]), campos[4], campos[5], Integer. parseInt(campos[6]));
							curso.add(programacao);
						} catch (ValorZeradoException | NumberFormatException | DuracaoInvalidaException e) {
							System.out.println("[ERRO] " + e.getMessage());
						}
						break;
						
					default:
						System.out.println("Invalido");
						break;
					}
					
					linha = leitura.readLine();
				}
				
				
				escrita.write(pacote.obterLinha());
				escrita.write(agile.obterLinha());
				escrita.write(bancoDados.obterLinha());
				escrita.write(programacao.obterLinha());
				
				escrita.close();
				leitura.close();
				fileR.close();
				
			} catch (IOException e) {
				System.out.println("[ERRO]" + e.getMessage());
				
			}
			
		}finally {
			System.out.println("Processamento realizado!");
		}
		
	}
}
