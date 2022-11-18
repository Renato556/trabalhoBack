package br.com.plataformacursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication()
public class PlataformaDeCursos {

	public static void main(String[] args) {
		SpringApplication.run(PlataformaDeCursos.class, args);
	}
}
