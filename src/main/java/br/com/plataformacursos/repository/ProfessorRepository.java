package br.com.plataformacursos.repository;

import br.com.plataformacursos.models.Professor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("professorRepository")
public interface ProfessorRepository {
    Professor findById(long id);
    List<Professor> findAll();
    void deleteById(long id);
    void deleteAll();
    void save(Professor professor);
    void save(long id, Professor professor);
}
