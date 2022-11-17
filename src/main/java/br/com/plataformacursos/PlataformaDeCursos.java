package br.com.plataformacursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication(scanBasePackages = {"br.com.plataformacursos.repository"})
public class PlataformaDeCursos {

	public static void main(String[] args) {
		SpringApplication.run(PlataformaDeCursos.class, args);
	}
}
