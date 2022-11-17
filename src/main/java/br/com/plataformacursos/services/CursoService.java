package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    Optional<Curso> getCursoById(long id);
    List<Curso> getAllCurso();
    void deleteCurso(long id);
    void insertCurso(Curso curso);
}
