package br.com.plataformacursos.repository;

import br.com.plataformacursos.models.Curso;
import br.com.plataformacursos.models.Instituicao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("instituicaoRepository")
public interface InstituicaoRepository {
    Instituicao findById(long id);
    List<Instituicao> findAll();
    void deleteById(long id);
    void deleteAll();
    void save (Instituicao instituicao);
    void save (long id, Instituicao instituicao);
}
