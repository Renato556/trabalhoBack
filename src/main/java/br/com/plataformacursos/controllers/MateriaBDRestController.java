package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Materia;
import br.com.plataformacursos.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/materia")
public class MateriaBDRestController {

    @Autowired
    private MateriaService materiaService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Materia> getMateria() {
        return materiaService.getAllMateria();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Materia getMateria(@PathVariable("id") long id) {
        return materiaService.getMateriaById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteMateria(@RequestHeader("authorization") String authorization) {
        materiaService.deleteAllMateria(authorization);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMateria(@RequestHeader("authorization") String authorization, @PathVariable("id") long id) {
        materiaService.deleteMateriaById(authorization, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateMateria(@RequestHeader("authorization") String authorization, @PathVariable("id") long id, @RequestBody Materia modulo) {
        materiaService.updateMateriaById(authorization, id, modulo);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void insertMateria(@RequestHeader("authorization") String authorization, @RequestBody Materia modulo) {
        materiaService.insertMateria(authorization, modulo);
    }
}
