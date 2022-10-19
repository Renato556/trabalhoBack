package br.com.plataformacursos.services;


import br.com.plataformacursos.models.Material;

import java.util.List;

public interface MaterialService {
    Material getMaterialById(long id);
    List<Material> getAllMaterial();
    void deleteMaterialById(String authorization, long id);
    void deleteAllMaterial(String authorization);
    void updateMaterialById(String authorization, long id, Material material);
    void insertMaterial(String authorization, Material material);
}
