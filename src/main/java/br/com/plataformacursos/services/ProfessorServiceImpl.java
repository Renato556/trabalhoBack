package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Professor;
import br.com.plataformacursos.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorServiceImpl implements ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    @Override
    public Professor getProfessorById(long id) {
        return professorRepository.findById(id);
    }

    @Override
    public List<Professor> getAllProfessor() {
        return professorRepository.findAll();
    }

    @Override
    public void deleteProfessorById(String authorization, long id) {
        if (authorization != null) {
            professorRepository.deleteById(id);
        }
    }

    @Override
    public void deleteAllProfessor(String authorization) {
        if (authorization != null) {
            professorRepository.deleteAll();
        }
    }

    @Override
    public void updateProfessorById(String authorization, long id, Professor professor) {
        if (authorization != null) {
            professorRepository.save(id, professor);
        }
    }

    @Override
    public void insertProfessor(String authorization, Professor professor) {
        if (authorization != null) {
            professorRepository.save(professor);
        }
    }
}
