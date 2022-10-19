package br.com.plataformacursos.services;


import br.com.plataformacursos.models.Professor;

import java.util.List;

public interface ProfessorService {
    Professor getProfessorById(long id);
    List<Professor> getAllProfessor();
    void deleteProfessorById(String authorization, long id);
    void deleteAllProfessor(String authorization);
    void updateProfessorById(String authorization, long id, Professor professor);
    void insertProfessor(String authorization, Professor professor);
}
