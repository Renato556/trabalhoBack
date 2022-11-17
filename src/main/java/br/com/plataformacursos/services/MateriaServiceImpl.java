package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Materia;
import br.com.plataformacursos.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaServiceImpl implements MateriaService{
    @Autowired
    MateriaRepository materiaRepository;

    @Override
    public Optional<Materia> getMateriaById(long id) {
        return materiaRepository.findById(id);
    }

    @Override
    public List<Materia> getAllMateria() {
        return materiaRepository.findAll();
    }

    @Override
    public void deleteMateria(long id) {
       materiaRepository.deleteById(id);
    }

    @Override
    public void insertMateria(Materia materia) {
        materiaRepository.save(materia);
    }
}
