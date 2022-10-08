package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Curso;
import br.com.plataformacursos.services.CursoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/curso")
public class CursoController {

    CursoService cursoService = new CursoService();

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Curso>> getAllCurso() {
        try {
            return ResponseEntity.ok(cursoService.getAllCurso());
        } catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Curso> getCurso(@PathVariable long id) {
        try {
            if(cursoService.chekIfExists(id)) {
                return ResponseEntity.ok(cursoService.getCurso(id));
            }
            return ResponseEntity.notFound().build();
        } catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> addCurso(@RequestBody Curso novoCurso) {
        try {
            if(!cursoService.chekIfExists(novoCurso.getId())) {
                return ResponseEntity.ok(cursoService.addCurso(novoCurso));
            }
            return ResponseEntity.notFound().build();
        } catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Curso> updateCurso(@PathVariable long id) {
        try {
            if(cursoService.chekIfExists(id)) {
                return ResponseEntity.ok(cursoService.updateCurso(id));
            }
            return ResponseEntity.notFound().build();
        } catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteCurso(@PathVariable long id) {
        try {
            if(cursoService.chekIfExists(id)) {
                return ResponseEntity.ok(cursoService.deleteCurso(id));
            }
            return ResponseEntity.notFound().build();
        } catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
