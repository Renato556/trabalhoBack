package br.com.gerenciadorseries.models;

import java.awt.image.BufferedImage;

public class Episodios {
    public int id;
    private String capaCaminho; //se for usar caminho da imagem
    private BufferedImage capa; //se for usar a imagem em si (deve-se limitar, pois li que consome muito)
    public String tituloEp;
    private double duracao;

    public Episodios(int id, String capaCaminho, BufferedImage capa, String tituloEp, double duracao) {
        this.id = id;
        this.capaCaminho = capaCaminho;
        this.capa = capa;
        this.tituloEp = tituloEp;
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTituloEp() {
        return tituloEp;
    }

    public void setTituloEp(String tituloEp) {
        this.tituloEp = tituloEp;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}

