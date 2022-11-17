package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Professor;
import br.com.plataformacursos.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorServiceImpl implements ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    @Override
    public Optional<Professor> getProfessorById(long id) {
        return professorRepository.findById(id);
    }

    @Override
    public List<Professor> getAllProfessor() {
        return professorRepository.findAll();
    }

    @Override
    public void deleteProfessor(long id) {
        professorRepository.deleteById(id);
    }

    @Override
    public void insertProfessor(Professor professor) {
        professorRepository.save(professor);
    }
}
