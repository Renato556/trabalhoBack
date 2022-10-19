package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Modulo;

import java.util.List;

public interface ModuloService {
    Modulo getModuloById(long id);
    List<Modulo> getAllModulo();
    void deleteModuloById(String authorization, long id);
    void deleteAllModulo(String authorization);
    void updateModuloById(String authorization, long id, Modulo modulo);
    void insertModulo(String authorization, Modulo modulo);
}
