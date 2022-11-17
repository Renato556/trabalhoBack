package br.com.plataformacursos.repository;

import br.com.plataformacursos.models.Curso;
import br.com.plataformacursos.models.Modulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("moduloRepository")
public interface ModuloRepository extends JpaRepository<Modulo, Long> {

}