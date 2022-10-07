package br.com.plataformacursos.models;

import java.util.List;

public class Modulo {
    private long id;
    private String titulo;
    private String resumo;
    private List<Materia> materias;
    private List<Professor> professores;
    private String certificado;

    public Modulo(long id, String titulo, String resumo, List<Materia> materias, List<Professor> professores, String certificado) {
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.materias = materias;
        this.professores = professores;
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

    public List<Materia> getMaterias() {
        return materias;
    }
    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public List<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public String getCertificado() {
        return certificado;
    }
    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }
}
