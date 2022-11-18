package br.com.plataformacursos.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titulo;
    private String diploma;

    @OneToMany
    @JoinColumn(name = "curso_id")
    private List<Modulo> moduloList;

    @JsonIgnore
    @ManyToMany(mappedBy = "cursoList")
    private List<Instituicao> instituicaoList;

    public List<Instituicao> getInstituicaoList() {
        return instituicaoList;
    }

    public void setInstituicaoList(List<Instituicao> instituicaoList) {
        this.instituicaoList = instituicaoList;
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
