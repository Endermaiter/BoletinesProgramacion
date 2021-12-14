package com.dam1;

public class Libros extends Publicacion {

    private boolean prestado;

    public Libros() {
    }


    public Libros(String codigo, String titulo, int ano, boolean prestado) {
        super(codigo, titulo, ano);
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString() + " Libros = " + prestado + " prestado";
    }

    @Override
    public int getAno(){
       return super.getAno();
    }

    @Override
    public String getCodigo(){
        return super.getCodigo();
    }

}
