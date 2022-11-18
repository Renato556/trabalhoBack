package br.com.plataformacursos.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Instituicao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    @ManyToMany
    @JoinTable(
            name = "instituicao_curso",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "instituicao_id"))
    private List<Curso> cursoList;

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
