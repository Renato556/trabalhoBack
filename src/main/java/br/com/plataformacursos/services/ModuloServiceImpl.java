package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Modulo;
import br.com.plataformacursos.repository.ModuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuloServiceImpl implements ModuloService {
    @Autowired
    ModuloRepository moduloRepository;

    @Override
    public Modulo getModuloById(long id) {
        return moduloRepository.findById(id);
    }

    @Override
    public List<Modulo> getAllModulo() {
        return moduloRepository.findAll();
    }

    @Override
    public void deleteModuloById(String authorization, long id) {
        if (authorization != null) {
            moduloRepository.deleteById(id);
        }
    }

    @Override
    public void deleteAllModulo(String authorization) {
        if (authorization != null) {
            moduloRepository.deleteAll();
        }
    }

    @Override
    public void updateModuloById(String authorization, long id, Modulo modulo) {
        if (authorization != null) {
            moduloRepository.save(id, modulo);
        }
    }

    @Override
    public void insertModulo(String authorization, Modulo modulo) {
        if (authorization != null) {
            moduloRepository.save(modulo);
        }
    }
}
