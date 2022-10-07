package br.com.plataformacursos.models;

public class Material {
    int id;
    String titulo;
    String formato;

    public Material(int id, String titulo, String formato) {
        this.id = id;
        this.titulo = titulo;
        this.formato = formato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
