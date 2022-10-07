package br.com.plataformacursos.models;

public class Professor {
    private long id;
    private String nome;
    private List<Materias> materiasLecionadas;

    public Professor(long id, String nome, List<Materias> materiasLecionadas) {
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

    public List<Materias> getMateriasLecionadas() {
        return materiasLecionadas;
    }

    public void setMateriasLecionadas(List<Materias> materiasLecionadas) {
        this.materiasLecionadas = materiasLecionadas;
    }
}
