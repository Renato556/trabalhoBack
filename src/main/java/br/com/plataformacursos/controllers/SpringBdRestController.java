package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Curso;
import br.com.plataformacursos.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/curso")
public class SpringBdRestController {
    @Autowired
    private CursoService cursoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Curso> getCursos() {
        return cursoService.getAllCurso();
    }

    @RequestMapping(value = "/{cursoId}", method = RequestMethod.GET)
    public Curso getCursos(@PathVariable("cursoId") long cursoId) {
        return cursoService.getCursoById(cursoId);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteCursos(@RequestHeader("authorization") String authorization) {
        cursoService.deleteAllCursos(authorization);
    }

    @RequestMapping(value = "/{cursoId}", method = RequestMethod.DELETE)
    public void deleteCurso(@RequestHeader("authorization") String authorization, @PathVariable("cursoId") long cursoId) {
        cursoService.deleteCursoById(authorization, cursoId);
    }

    @RequestMapping(value = "/{cursoId}", method = RequestMethod.PUT)
    public void updateCurso(@RequestHeader("authorization") String authorization, @PathVariable("cursoId") long cursoId, @RequestBody Curso curso) {
        cursoService.updateCursoById(authorization, cursoId, curso);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void insertCurso(@RequestHeader("authorization") String authorization, @RequestBody Curso curso) {
        cursoService.insertCurso(authorization, curso);
    }
}
