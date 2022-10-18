package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Curso;

import java.util.List;

public interface CursoService {
    Curso getCursoById(long cursoId);
    List<Curso> getAllCurso();
    void deleteCursoById(String authorization, long cursoId);
    void deleteAllCursos(String authorization);
    void updateCursoById(String authorization, long cursoId, Curso curso);
    void insertCurso(String authorization, Curso curso);
}
