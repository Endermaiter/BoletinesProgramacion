package com.dam1;

public class Revistas extends Publicacion{

    private int numero;

    public Revistas() {
        super();
        numero=0;
    }

    public Revistas(String codigo, String titulo, int ano, int numero) {
        super(codigo, titulo, ano);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + " Numero de Revista é " + numero;
    }
}
