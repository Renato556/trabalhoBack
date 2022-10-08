package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Curso;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    public boolean chekIfExists(long id) {
        return false;
    }

    public List<Curso> getAllCurso() {
        return null;
    }

    public Curso getCurso(long id) {
        return null;
    }

    public String addCurso(Curso novoCurso) {
        return "Curso " + novoCurso.getTitulo() + " cadastrado com sucesso!";
    }

    public Curso updateCurso(long id) {
        return null;
    }

    public String deleteCurso(long id) {
        return "Curso deletado com sucesso!";
    }
}
