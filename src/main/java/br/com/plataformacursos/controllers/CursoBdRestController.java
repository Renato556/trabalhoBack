package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Curso;
import br.com.plataformacursos.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/curso")
public class CursoBdRestController {
    @Autowired
    private CursoService cursoService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Curso> getCurso() {
        return cursoService.getAllCurso();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Curso> getCursoById(@PathVariable("id") long id) {
        return cursoService.getCursoById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteAllCurso() {
        cursoService.getAllCurso().forEach(curso -> cursoService.deleteCurso(curso.getId()));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCurso(@PathVariable("id") long id) {
        if (cursoService.getCursoById(id).isPresent()){
            cursoService.deleteCurso(id);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateCurso(@PathVariable("id") long id, @RequestBody Curso curso) {
        if (cursoService.getCursoById(id).isPresent()){
            curso.setId(id);
            cursoService.insertCurso(curso);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void insertCurso(@RequestBody Curso curso) {
        cursoService.insertCurso(curso);
    }
}
