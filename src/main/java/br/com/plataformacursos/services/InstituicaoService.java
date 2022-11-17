package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Instituicao;

import java.util.List;
import java.util.Optional;

public interface InstituicaoService {
    Optional<Instituicao> getInstituicaoById(long id);
    List<Instituicao> getAllInstituicao();
    void deleteInstituicao(long id);
    void insertInstituicao(Instituicao instituicao);
}
