package com.dam1;

public class Película extends Multimedia {

    private String actorPrinc;
    private String actrizPrinc;

    public Película() {
    }

    public Película(String titulo, String autor, String formato, int duracion, String actorPrinc, String actrizPrinc) {
        super(titulo, autor, formato, duracion);
        this.actorPrinc = actorPrinc;
        this.actrizPrinc = actrizPrinc;
    }

    public String getActorPrinc() {
        return actorPrinc;
    }

    public String getActrizPrinc() {
        return actrizPrinc;
    }

    @Override
    public String toString() {
        return super.toString() + " Película-->" + " actorPrinc= " + actorPrinc + '\'' + ", actrizPrinc= " + actrizPrinc;
    }



}
