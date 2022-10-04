package br.com.gerenciadorseries.models;

import java.awt.image.BufferedImage;

public class Temporadas {
    public int id;
    private String tituloTemp;
    private String resumo;
    public int[] listaEp;

    public Temporadas(int id, String tituloTemp, String resumo, int[] listaEp) {
        this.id = id;
        this.tituloTemp = tituloTemp;
        this.resumo = resumo;
        this.listaEp = listaEp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloTemp() {
        return tituloTemp;
    }

    public void setTituloTemp(String tituloTemp) {
        this.tituloTemp = tituloTemp;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int[] getListaEp() {
        return listaEp;
    }

    public void setListaEp(int[] listaEp) {
        this.listaEp = listaEp;
    }


}
