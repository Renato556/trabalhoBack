package br.com.plataformacursos.repository;

import br.com.plataformacursos.models.Curso;
import br.com.plataformacursos.models.Instituicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("instituicaoRepository")
public interface InstituicaoRepository extends JpaRepository<Instituicao, Long> {

}