package br.edu.infnet.appcurso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurso.model.domain.Cliente;
import br.edu.infnet.appcurso.model.domain.Endereco;
import br.edu.infnet.appcurso.model.domain.Usuario;
import br.edu.infnet.appcurso.model.service.ClienteService;

@Order(2)
@Component
public class ClienteLoader implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
			
			try {

				String arq = "clientes.txt";

				try {
					FileReader fileR = new FileReader(arq);
					BufferedReader leitura = new BufferedReader(fileR);

					String linha = leitura.readLine();
					String[] campos = null;


					while (linha != null) {

						campos = linha.split(";");

						Usuario usuario = new Usuario();
						usuario.setId(1);

							Cliente cliente = new Cliente(campos[0], campos[1], Integer.parseInt(campos[2]));
							
							Endereco endereco = new Endereco();
							endereco.setCep(campos[3]);
							endereco.setLogradouro(campos[4]);
							endereco.setComplemento(campos[5]);
							endereco.setBairro(campos[6]);
							endereco.setLocalidade(campos[7]);
							endereco.setUf(campos[8]);
							
							cliente.setEndereco(endereco);

							cliente.setUsuario(usuario);

							clienteService.incluir(cliente);


						linha = leitura.readLine();
					}

					leitura.close();
					fileR.close();

				} catch (IOException e) {
					System.out.println("[ERRO]" + e.getMessage());

				}

			} finally {
				System.out.println("Processamento realizado!");
			}
	}

}
