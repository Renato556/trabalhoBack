package br.com.plataformacursos.services;


import br.com.plataformacursos.models.Material;

import java.util.List;
import java.util.Optional;

public interface MaterialService {
    Optional<Material> getMaterialById(long id);
    List<Material> getAllMaterial();
    void deleteMaterial(long id);
    void insertMaterial(Material material);
}
