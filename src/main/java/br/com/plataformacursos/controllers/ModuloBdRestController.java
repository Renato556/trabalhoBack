package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Modulo;
import br.com.plataformacursos.services.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/modulo")
public class ModuloBdRestController {
    @Autowired
    private ModuloService moduloService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Modulo> getModulo() {
        return moduloService.getAllModulo();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Modulo getModulo(@PathVariable("id") long id) {
        return moduloService.getModuloById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteModulo(@RequestHeader("authorization") String authorization) {
        moduloService.deleteAllModulo(authorization);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteModulo(@RequestHeader("authorization") String authorization, @PathVariable("id") long id) {
        moduloService.deleteModuloById(authorization, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateModulo(@RequestHeader("authorization") String authorization, @PathVariable("id") long id, @RequestBody Modulo modulo) {
        moduloService.updateModuloById(authorization, id, modulo);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void insertModulo(@RequestHeader("authorization") String authorization, @RequestBody Modulo modulo) {
        moduloService.insertModulo(authorization, modulo);
    }
}
