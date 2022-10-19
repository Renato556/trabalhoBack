package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Professor;
import br.com.plataformacursos.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/professor")
public class ProfessorBdRestController {
    @Autowired
    private ProfessorService professorService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Professor> getProfessor() {
        return professorService.getAllProfessor();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Professor getProfessor(@PathVariable("id") long id) {
        return professorService.getProfessorById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteProfessor(@RequestHeader("authorization") String authorization) {
        professorService.deleteAllProfessor(authorization);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteProfessor(@RequestHeader("authorization") String authorization, @PathVariable("id") long id) {
        professorService.deleteProfessorById(authorization, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateProfessor(@RequestHeader("authorization") String authorization, @PathVariable("id") long id, @RequestBody Professor professor) {
        professorService.updateProfessorById(authorization, id, professor);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void insertProfessor(@RequestHeader("authorization") String authorization, @RequestBody Professor professor) {
        professorService.insertProfessor(authorization, professor);
    }
}
