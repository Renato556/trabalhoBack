package br.com.plataformacursos.repository;

import br.com.plataformacursos.models.Modulo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("moduloRepository")
public interface ModuloRepository {
    Modulo findById(long id);
    List<Modulo> findAll();
    void deleteById(long id);
    void deleteAll();
    void save(Modulo modulo);
    void save(long id, Modulo modulo);
}
