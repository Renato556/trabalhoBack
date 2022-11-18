package br.com.plataformacursos.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Modulo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titulo;
    private String resumo;
    private String certificado;
    @OneToMany
    @JoinColumn(name = "modulo_id")
    private List<Materia> materiaList;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
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

    public String getCertificado() {
        return certificado;
    }
    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }
}
