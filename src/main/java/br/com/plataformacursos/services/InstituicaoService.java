package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Instituicao;

import java.util.List;

public interface InstituicaoService {
    Instituicao getInstituicaoById(long id);
    List<Instituicao> getAllInstituicao();
    void deleteInstituicaoById(String authorization, long id);
    void deleteAllInstituicao(String authorization);
    void updateInstituicaoById(String authorization, long id, Instituicao instituicao);
    void insertInstituicao(String authorization, Instituicao instituicao);
}
