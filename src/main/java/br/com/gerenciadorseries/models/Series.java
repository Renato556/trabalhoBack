package br.com.gerenciadorseries.models;

import java.awt.image.BufferedImage;

public class Series {
    public int id;
    private String tituloSerie;
    private String capaCaminho; //se for usar caminho da imagem
    private BufferedImage capa; //se for usar a imagem em si (deve-se limitar, pois li que consome muito)
    public int[] listaTemp;

    public Series(int id, String tituloSerie, String capaCaminho, BufferedImage capa, int[] listaTemp) {
        this.id = id;
        this.tituloSerie = tituloSerie;
        this.capaCaminho = capaCaminho;
        this.capa = capa;
        this.listaTemp = listaTemp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloSerie() {
        return tituloSerie;
    }

    public void setTituloSerie(String tituloSerie) {
        this.tituloSerie = tituloSerie;
    }

    public String getCapaCaminho() {
        return capaCaminho;
    }

    public void setCapaCaminho(String capaCaminho) {
        this.capaCaminho = capaCaminho;
    }

    public BufferedImage getCapa() {
        return capa;
    }

    public void setCapa(BufferedImage capa) {
        this.capa = capa;
    }

    public int[] getListaTemp() {
        return listaTemp;
    }

    public void setListaTemp(int[] listaTemp) {
        this.listaTemp = listaTemp;
    }
}
