package br.com.plataformacursos.services;

import br.com.plataformacursos.models.Curso;
import br.com.plataformacursos.models.Instituicao;
import br.com.plataformacursos.repository.InstituicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstituicaoServiceImpl implements InstituicaoService{
    @Autowired
    InstituicaoRepository instituicaoRepository;

    @Override
    public Optional<Instituicao> getInstituicaoById(long instituicaoId) {
        return instituicaoRepository.findById(instituicaoId);
    }

    @Override
    public List<Instituicao> getAllInstituicao() {
        return instituicaoRepository.findAll();
    }

    @Override
    public void deleteInstituicao(long instituicaoId) {
        instituicaoRepository.deleteById(instituicaoId);
    }

    @Override
    public void insertInstituicao(Instituicao instituicao) {
        instituicaoRepository.save(instituicao);
    }
}
