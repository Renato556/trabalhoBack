package br.com.gerenciadorseries.models;

public class Usuario {

    public int id;
    private String nome;
    public int[] listaPla;

    public Usuario(int id, String nome, int[] listaPla) {
        this.id = id;
        this.nome = nome;
        this.listaPla = listaPla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getListaPla() {
        return listaPla;
    }

    public void setListaPla(int[] listaPla) {
        this.listaPla = listaPla;
    }
}
