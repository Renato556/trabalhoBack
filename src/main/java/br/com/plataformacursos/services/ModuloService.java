package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Material;
import br.com.plataformacursos.models.Modulo;

import java.util.List;
import java.util.Optional;

public interface ModuloService {
    Optional<Modulo> getModuloById(long id);
    List<Modulo> getAllModulo();
    void deleteModulo(long id);
    void insertModulo(Modulo modulo);
}
