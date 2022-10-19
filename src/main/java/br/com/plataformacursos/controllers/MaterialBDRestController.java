package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Material;
import br.com.plataformacursos.models.Modulo;
import br.com.plataformacursos.services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Material getMaterial(@PathVariable("id") long id) {
        return materialService.getMaterialById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteMaterial(@RequestHeader("authorization") String authorization) {
        materialService.deleteAllMaterial(authorization);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMaterial(@RequestHeader("authorization") String authorization, @PathVariable("id") long id) {
        materialService.deleteMaterialById(authorization, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateMaterial(@RequestHeader("authorization") String authorization, @PathVariable("id") long id, @RequestBody Material modulo) {
        materialService.updateMaterialById(authorization, id, modulo);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void insertMaterial(@RequestHeader("authorization") String authorization, @RequestBody Material modulo) {
        materialService.insertMaterial(authorization, modulo);
    }
}
