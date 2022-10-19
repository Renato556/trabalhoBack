package br.com.plataformacursos.repository;

import br.com.plataformacursos.models.Material;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("materialRepository")
public interface MaterialRepository {
    Material findById(long id);
    List<Material> findAll();
    void deleteById(long id);
    void deleteAll();
    void save(Material material);
    void save(long id, Material material);
}
