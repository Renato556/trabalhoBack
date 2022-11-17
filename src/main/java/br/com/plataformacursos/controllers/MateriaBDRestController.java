package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Materia;
import br.com.plataformacursos.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<Materia> getMateria(@PathVariable("id") long id) {
        return materiaService.getMateriaById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteMateria() {
        materiaService.getAllMateria().forEach(materia -> materiaService.deleteMateria(materia.getId()));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMateriaById(@PathVariable("id") long id) {
        if (materiaService.getMateriaById(id).isPresent()) {
            materiaService.deleteMateria(id);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateMateria(@PathVariable("id") long id, @RequestBody Materia materia) {
        if (materiaService.getMateriaById(id).isPresent()) {
            materia.setId(id);
            materiaService.insertMateria(materia);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void insertMateria(@RequestBody Materia materia) {
        materiaService.insertMateria(materia);
    }
}
