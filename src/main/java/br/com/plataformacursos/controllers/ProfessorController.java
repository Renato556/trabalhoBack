package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Professor;
import br.com.plataformacursos.services.ProfessorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/professor")
public class ProfessorController {

    ProfessorService professorService = new ProfessorService();

    @GetMapping
    public ResponseEntity<List<Professor>> getAllProfessor() {
        try {
            return ResponseEntity.ok(professorService.getAllProfessor());
        } catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> getOneProfessor(@PathVariable long id) {
        try {
            if(professorService.checkProfessor(id)) {
                return ResponseEntity.ok(professorService.getOneProfessor(id));
            }
            return ResponseEntity.notFound().build();
        } catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Professor> editProfessor(@PathVariable long id) {
        try {
            if(professorService.checkProfessor(id)) {
                return ResponseEntity.ok(professorService.editProfessor(id));
            }
            return ResponseEntity.notFound().build();
        } catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping
    public ResponseEntity<String> addProfessor(@RequestBody Professor novoProfessor) {
        try {
            if(!professorService.checkProfessor(novoProfessor.getId())) {
                professorService.addProfessor(novoProfessor);
                return ResponseEntity.ok("Professor " + novoProfessor.getNome() +  " cadastrado com sucesso");
            }
            return ResponseEntity.notFound().build();
        } catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }

    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<String> deleteProfessor(@PathVariable long id) {
        try {
            if(professorService.checkProfessor(id)) {
                professorService.deleteProfessor(id);
                return ResponseEntity.ok("Professor excluído com sucesso");
            }
            return ResponseEntity.notFound().build();
        } catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
