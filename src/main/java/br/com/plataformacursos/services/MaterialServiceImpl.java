package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Material;
import br.com.plataformacursos.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    MaterialRepository materialRepository;

    @Override
    public Optional<Material> getMaterialById(long id) {
        return materialRepository.findById(id);
    }

    @Override
    public List<Material> getAllMaterial() {
        return materialRepository.findAll();
    }

    @Override
    public void deleteMaterial(long id) {
        materialRepository.deleteById(id);
    }

    @Override
    public void insertMaterial(Material material) {
        materialRepository.save(material);
    }
}
