package br.com.plataformacursos.models;

import java.util.List;

public class Curso {
    private long id;
    private String titulo;
    private List<Modulo> modulos;
    private String diploma;

    public Curso(long id, String titulo, List<Modulo> modulos, String diploma) {
        this.id = id;
        this.titulo = titulo;
        this.modulos = modulos;
        this.diploma = diploma;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }
    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public String getDiploma() {
        return diploma;
    }
    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }
}
