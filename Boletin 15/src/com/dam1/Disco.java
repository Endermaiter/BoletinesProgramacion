package com.dam1;

public class Disco extends Multimedia {

    private String xénero;

    public Disco() {

    }

    public Disco(String titulo, String autor, String formato, int duracion, String xénero) {
        super(titulo, autor, formato, duracion);
        this.xénero = xénero;
    }

    public String getXénero() {
        return xénero;
    }

    @Override
    public String toString() {
        return super.toString() + " Disco-->" + " xénero= " + xénero;
    }
}
