package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Curso;
import br.com.plataformacursos.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/curso")
public class CursoBdRestController {
    @Autowired
    private CursoService cursoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Curso> getCurso() {
        return cursoService.getAllCurso();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Curso getCurso(@PathVariable("id") long id) {
        return cursoService.getCursoById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteCurso(@RequestHeader("authorization") String authorization) {
        cursoService.deleteAllCurso(authorization);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCurso(@RequestHeader("authorization") String authorization, @PathVariable("id") long id) {
        cursoService.deleteCursoById(authorization, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateCurso(@RequestHeader("authorization") String authorization, @PathVariable("id") long id, @RequestBody Curso curso) {
        cursoService.updateCursoById(authorization, id, curso);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void insertCurso(@RequestHeader("authorization") String authorization, @RequestBody Curso curso) {
        cursoService.insertCurso(authorization, curso);
    }
}
