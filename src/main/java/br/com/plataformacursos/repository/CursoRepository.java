package br.com.plataformacursos.repository;

import br.com.plataformacursos.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("cursoRepository")
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
