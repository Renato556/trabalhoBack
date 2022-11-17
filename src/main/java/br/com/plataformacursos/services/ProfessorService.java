package br.com.plataformacursos.services;


import br.com.plataformacursos.models.Professor;

import java.util.List;
import java.util.Optional;

public interface ProfessorService {
    Optional<Professor> getProfessorById(long id);
    List<Professor> getAllProfessor();
    void deleteProfessor(long id);
    void insertProfessor(Professor professor);
}
