package br.com.plataformacursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"br.com.plataformacursos.repository"})
public class PlataformaDeCursos {

	public static void main(String[] args) {
		SpringApplication.run(PlataformaDeCursos.class, args);
	}

}
