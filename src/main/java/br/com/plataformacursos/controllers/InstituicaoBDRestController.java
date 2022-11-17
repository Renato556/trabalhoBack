package br.com.plataformacursos.controllers;
import br.com.plataformacursos.models.Instituicao;
import br.com.plataformacursos.services.InstituicaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/instituicao")
public class InstituicaoBDRestController {

    @Autowired
    private InstituicaoService instituicaoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Instituicao> getInstituicao() {
        return instituicaoService.getAllInstituicao();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Instituicao> getInstituicaoById(@PathVariable("id") long id) {
        return instituicaoService.getInstituicaoById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteAllInstituicao() {
        instituicaoService.getAllInstituicao().forEach(instituicao -> instituicaoService.deleteInstituicao(instituicao.getId()));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteInstituicao(@PathVariable("id") long id) {
        if (instituicaoService.getInstituicaoById(id).isPresent()) {
            instituicaoService.deleteInstituicao(id);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateInstituicao(@PathVariable("id") long id, @RequestBody Instituicao instituicao) {
        if (instituicaoService.getInstituicaoById(id).isPresent()) {
            instituicao.setId(id);
            instituicaoService.insertInstituicao(instituicao);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void insertInstituicao(@RequestBody Instituicao instituicao) {
        instituicaoService.insertInstituicao(instituicao);
    }
}
