package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Materia;
import br.com.plataformacursos.models.Material;

import java.util.List;
import java.util.Optional;

public interface MateriaService {
    Optional<Materia> getMateriaById(long id);
    List<Materia> getAllMateria();
    void deleteMateria(long id);
    void insertMateria(Materia materia);
}
