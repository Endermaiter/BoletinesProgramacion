package com.dam1;

public class Publicacion {

    private String codigo;
    private String titulo;
    private int ano;

    public Publicacion() {
    }

    public Publicacion(String codigo, String titulo, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Publicacion--> " + "codigo= " + codigo + '\'' + ", titulo=" + titulo + '\'' + ", ano= " + ano;
    }


    public int getAno() {
        return ano;
    }
}
