package br.com.plataformacursos.controllers;
import br.com.plataformacursos.models.Instituicao;
import br.com.plataformacursos.services.InstituicaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/instituicao")
public class InstituicaoBDRestController {

    @Autowired
    private InstituicaoService instituicaoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Instituicao> getAllInstituicao() {
        return instituicaoService.getAllInstituicao();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Instituicao getInstituicaoById(@PathVariable("id") long id) {
        return instituicaoService.getInstituicaoById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteAllInstituicao(@RequestHeader("authorization") String authorization) {
        instituicaoService.deleteAllInstituicao(authorization);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteInstituicaoById(@RequestHeader("authorization") String authorization, @PathVariable("id") long id) {
        instituicaoService.deleteInstituicaoById(authorization, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateInstituicaoById(@RequestHeader("authorization") String authorization, @PathVariable("id") long id, @RequestBody Instituicao instituicao) {
        instituicaoService.updateInstituicaoById(authorization, id, instituicao);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void insertInstituicao(@RequestHeader("authorization") String authorization, @RequestBody Instituicao instituicao) {
        instituicaoService.insertInstituicao(authorization, instituicao);
    }

}
