package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Modulo;
import br.com.plataformacursos.repository.ModuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModuloServiceImpl implements ModuloService {
    @Autowired
    ModuloRepository moduloRepository;

    @Override
    public Optional<Modulo> getModuloById(long id) {
        return moduloRepository.findById(id);
    }

    @Override
    public List<Modulo> getAllModulo() {
        return moduloRepository.findAll();
    }

    @Override
    public void deleteModulo(long id) {
        moduloRepository.deleteById(id);
    }

    @Override
    public void insertModulo(Modulo modulo) {
        moduloRepository.save(modulo);
    }
}
