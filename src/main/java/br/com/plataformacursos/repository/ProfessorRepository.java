package br.com.plataformacursos.repository;

import br.com.plataformacursos.models.Curso;
import br.com.plataformacursos.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("professorRepository")
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}