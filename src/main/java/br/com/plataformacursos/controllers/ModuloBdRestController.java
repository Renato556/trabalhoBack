package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Modulo;
import br.com.plataformacursos.services.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/modulo")
public class ModuloBdRestController {
    @Autowired
    private ModuloService moduloService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Modulo> getModulo() {
        return moduloService.getAllModulo();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Modulo> getModulo(@PathVariable("id") long id) {
        return moduloService.getModuloById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteModulo() {
        moduloService.getAllModulo().forEach(modulo -> moduloService.deleteModulo(modulo.getId()));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteModulo(@PathVariable("id") long id) {
        if (moduloService.getModuloById(id).isPresent()) {
            moduloService.deleteModulo(id);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateModulo(@PathVariable("id") long id, @RequestBody Modulo modulo) {
        if (moduloService.getModuloById(id).isPresent()) {
            modulo.setId(id);
            moduloService.insertModulo(modulo);
        }
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void insertModulo(@RequestBody Modulo modulo) {
        moduloService.insertModulo(modulo);
    }
}
