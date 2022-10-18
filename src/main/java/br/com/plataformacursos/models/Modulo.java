package br.com.plataformacursos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Modulo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titulo;
    private String resumo;
    private List<Materia> materiaList;
    private List<Professor> professorList;
    private String certificado;

    public Modulo(long id, String titulo, String resumo, List<Materia> materiaList, List<Professor> professorList, String certificado) {
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.materiaList = materiaList;
        this.professorList = professorList;
        this.certificado = certificado;
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

    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public List<Materia> getMateriaList() {
        return materiaList;
    }
    public void setMateriaList(List<Materia> materiaList) {
        this.materiaList = materiaList;
    }

    public List<Professor> getProfessorList() {
        return professorList;
    }
    public void setProfessorList(List<Professor> professorList) {
        this.professorList = professorList;
    }

    public String getCertificado() {
        return certificado;
    }
    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }
}
