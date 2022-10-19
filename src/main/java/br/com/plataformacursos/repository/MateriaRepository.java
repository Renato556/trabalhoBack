package br.com.plataformacursos.repository;

import br.com.plataformacursos.models.Materia;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("materiaRepository")
public interface MateriaRepository {
    Materia findById(long id);
    List<Materia> findAll();
    void deleteById(long id);
    void deleteAll();
    void save(Materia materia);
    void save(long id, Materia materia);
}
