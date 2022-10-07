package br.com.plataformacursos.models;

import java.util.List;

public class Professor {
    private long id;
    private String nome;
    private List<Materia> materiasLecionadas;

    public Professor(long id, String nome, List<Materia> materiasLecionadas) {
        this.id = id;
        this.nome = nome;
        this.materiasLecionadas = materiasLecionadas;
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

    public List<Materia> getMateriasLecionadas() {
        return materiasLecionadas;
    }

    public void setMateriasLecionadas(List<Materia> materiasLecionadas) {
        this.materiasLecionadas = materiasLecionadas;
    }
}
