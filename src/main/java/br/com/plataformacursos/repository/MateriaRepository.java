package br.com.plataformacursos.repository;

import br.com.plataformacursos.models.Curso;
import br.com.plataformacursos.models.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("materiaRepository")
public interface MateriaRepository extends JpaRepository<Materia, Long> {

}