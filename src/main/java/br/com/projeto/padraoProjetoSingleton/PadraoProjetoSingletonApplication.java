package br.com.projeto.padraoProjetoSingleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PadraoProjetoSingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraoProjetoSingletonApplication.class, args);

		System.out.println("----------------------");
		System.out.println("ENTROU NA APLICAÇÃO!!!");
		System.out.println("----------------------");

	}

}
