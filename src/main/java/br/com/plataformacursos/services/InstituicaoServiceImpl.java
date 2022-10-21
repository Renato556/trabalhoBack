package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Instituicao;
import br.com.plataformacursos.repository.InstituicaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstituicaoServiceImpl implements InstituicaoService{

    InstituicaoRepository instituicaoRepository;

    @Override
    public Instituicao getInstituicaoById(long id) {
        return instituicaoRepository.findById(id);
    }

    @Override
    public List<Instituicao> getAllInstituicao() {
        return instituicaoRepository.findAll();
    }

    @Override
    public void deleteInstituicaoById(String authorization, long id) {
        if (authorization != null){
            instituicaoRepository.deleteById(id);
        }
    }

    @Override
    public void deleteAllInstituicao(String authorization) {
        if (authorization != null){
            instituicaoRepository.deleteAll();
        }
    }

    @Override
    public void updateInstituicaoById(String authorization, long id, Instituicao instituicao) {
        if (authorization != null){
            instituicaoRepository.save(id, instituicao);
        }
    }

    @Override
    public void insertInstituicao(String authorization, Instituicao instituicao) {
        if (authorization != null){
            instituicaoRepository.save(instituicao);
        }
    }
}
