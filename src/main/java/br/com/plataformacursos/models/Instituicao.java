package br.com.plataformacursos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Instituicao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private List<Curso> cursoList;

    public Instituicao(long id, String nome, List<Curso> cursoList) {
        this.id = id;
        this.nome = nome;
        this.cursoList = cursoList;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursoList() {
        return cursoList;
    }
    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

}
