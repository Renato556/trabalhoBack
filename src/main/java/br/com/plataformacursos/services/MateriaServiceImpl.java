package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Materia;
import br.com.plataformacursos.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServiceImpl implements MateriaService{
    @Autowired
    MateriaRepository materiaRepository;

    @Override
    public Materia getMateriaById(long id) {
        return materiaRepository.findById(id);
    }

    @Override
    public List<Materia> getAllMateria() {
        return materiaRepository.findAll();
    }

    @Override
    public void deleteMateriaById(String authorization, long id) {
        if (authorization != null) {
            materiaRepository.deleteById(id);
        }
    }

    @Override
    public void deleteAllMateria(String authorization) {
        if (authorization != null) {
            materiaRepository.deleteAll();
        }
    }

    @Override
    public void updateMateriaById(String authorization, long id, Materia materia) {
        if (authorization != null) {
            materiaRepository.save(id, materia);
        }
    }

    @Override
    public void insertMateria(String authorization, Materia materia) {
        if (authorization != null) {
            materiaRepository.save(materia);
        }
    }
}
