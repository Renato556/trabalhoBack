package br.com.plataformacursos.repository;

import br.com.plataformacursos.models.Curso;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("cursoRepository")
public interface CursoRepository {
    Curso findById(long id);
    List<Curso> findAll();
    void deleteById(long id);
    void deleteAll();
    void save(Curso curso);
    void save(long id, Curso curso);
}
