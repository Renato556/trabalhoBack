package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Curso;

import java.util.List;

public interface CursoService {
    Curso getCursoById(long id);
    List<Curso> getAllCurso();
    void deleteCursoById(String authorization, long id);
    void deleteAllCurso(String authorization);
    void updateCursoById(String authorization, long id, Curso curso);
    void insertCurso(String authorization, Curso curso);
}
