package br.edu.infnet.appcurso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppcursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppcursoApplication.class, args);
	}

}

