package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Curso;
import br.com.plataformacursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {
    CursoRepository cursoRepository;

    @Override
    public Curso getCursoById(long cursoId) {
        return cursoRepository.findById(cursoId);
    }

    @Override
    public List<Curso> getAllCurso() {
        return cursoRepository.findAll();
    }

    @Override
    public void deleteCursoById(String authorization, long cursoId) {
        if (authorization != null) {
            cursoRepository.deleteById(cursoId);
        }
    }

    @Override
    public void deleteAllCursos(String authorization) {
        if (authorization != null) {
            cursoRepository.deleteAll();
        }
    }

    @Override
    public void updateCursoById(String authorization, long cursoId, Curso curso) {
        if (authorization != null) {
            cursoRepository.save(cursoId, curso);
        }
    }

    @Override
    public void insertCurso(String authorization, Curso curso) {
        if (authorization != null) {
            cursoRepository.save(curso);
        }
    }
}
