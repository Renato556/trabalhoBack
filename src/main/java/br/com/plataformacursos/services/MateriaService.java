package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Materia;

import java.util.List;

public interface MateriaService {
    Materia getMateriaById(long id);
    List<Materia> getAllMateria();
    void deleteMateriaById(String authorization, long id);
    void deleteAllMateria(String authorization);
    void updateMateriaById(String authorization, long id, Materia materia);
    void insertMateria(String authorization, Materia materia);
}
