package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Curso;
import br.com.plataformacursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    CursoRepository cursoRepository;

    @Override
    public Optional<Curso> getCursoById(long cursoId) {
        return cursoRepository.findById(cursoId);
    }

    @Override
    public List<Curso> getAllCurso() {
        return cursoRepository.findAll();
    }

    @Override
    public void deleteCurso(long cursoId) {
        cursoRepository.deleteById(cursoId);
    }

    @Override
    public void insertCurso(Curso curso) {
        cursoRepository.save(curso);
    }
}
