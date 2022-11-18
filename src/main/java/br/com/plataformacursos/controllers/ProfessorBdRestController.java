package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Professor;
import br.com.plataformacursos.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/professor")
public class ProfessorBdRestController {
    @Autowired
    private ProfessorService professorService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Professor> getProfessor() {
        return professorService.getAllProfessor();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Professor> getProfessor(@PathVariable("id") long id) {
        return professorService.getProfessorById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteProfessor() {
        professorService.getAllProfessor().forEach(professor -> professorService.deleteProfessor(professor.getId()));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteProfessor(@PathVariable("id") long id) {
        if (professorService.getProfessorById(id).isPresent()) {
            professorService.deleteProfessor(id);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateProfessor(@PathVariable("id") long id, @RequestBody Professor professor) {
        if (professorService.getProfessorById(id).isPresent()) {
            professor.setId(id);
            professorService.insertProfessor(professor);
        }
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void insertProfessor(@RequestBody Professor professor) {
        professorService.insertProfessor(professor);
    }
}
