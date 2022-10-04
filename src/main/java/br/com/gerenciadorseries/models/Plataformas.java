package br.com.gerenciadorseries.models;

public class Plataformas {

    public int id;
    private String tituloPla;
    public int[] listaSrs;

    public Plataformas(int id, String tituloPla, int[] listaSrs) {
        this.id = id;
        this.tituloPla = tituloPla;
        this.listaSrs = listaSrs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloPla() {
        return tituloPla;
    }

    public void setTituloPla(String tituloPla) {
        this.tituloPla = tituloPla;
    }

    public int[] getListaSrs() {
        return listaSrs;
    }

    public void setListaSrs(int[] listaSrs) {
        this.listaSrs = listaSrs;
    }
}
