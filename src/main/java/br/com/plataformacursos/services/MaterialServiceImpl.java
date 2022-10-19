package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Material;
import br.com.plataformacursos.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    MaterialRepository materialRepository;

    @Override
    public Material getMaterialById(long id) {
        return materialRepository.findById(id);
    }

    @Override
    public List<Material> getAllMaterial() {
        return materialRepository.findAll();
    }

    @Override
    public void deleteMaterialById(String authorization, long id) {
        if (authorization != null) {
            materialRepository.deleteById(id);
        }
    }

    @Override
    public void deleteAllMaterial(String authorization) {
        if (authorization != null) {
            materialRepository.deleteAll();
        }
    }

    @Override
    public void updateMaterialById(String authorization, long id, Material material) {
        if (authorization != null) {
            materialRepository.save(id, material);
        }
    }

    @Override
    public void insertMaterial(String authorization, Material material) {
        if (authorization != null) {
            materialRepository.save(material);
        }
    }
}
