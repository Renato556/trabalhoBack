package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Material;
import br.com.plataformacursos.services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/material")
public class MaterialBDRestController {
    @Autowired
    private MaterialService materialService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Material> getMaterial() {
        return materialService.getAllMaterial();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Material> getMaterial(@PathVariable("id") long id) {
        return materialService.getMaterialById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteMaterial() {
        materialService.getAllMaterial().forEach(material -> materialService.deleteMaterial(material.getId()));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMaterial(@PathVariable("id") long id) {
        if (materialService.getMaterialById(id).isPresent()) {
            materialService.deleteMaterial(id);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateMaterial(@PathVariable("id") long id, @RequestBody Material material) {
        if (materialService.getMaterialById(id).isPresent()) {
            material.setId(id);
            materialService.insertMaterial(material);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void insertMaterial(@RequestBody Material material) {
        materialService.insertMaterial(material);
    }
}
