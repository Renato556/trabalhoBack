package br.com.plataformacursos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titulo;
    private List<Modulo> moduloList;
    private String diploma;

    public Curso(long id, String titulo, List<Modulo> moduloList, String diploma) {
        this.id = id;
        this.titulo = titulo;
        this.moduloList = moduloList;
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

    public List<Modulo> getModuloList() {
        return moduloList;
    }
    public void setModuloList(List<Modulo> moduloList) {
        this.moduloList = moduloList;
    }

    public String getDiploma() {
        return diploma;
    }
    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }
}
