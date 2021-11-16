package com.dam1;

import javax.swing.*;

public class Persoa {

    //atributos

    private String nome;
    private float peso;

    //métodos

    public String Persoa1Nome() {
        String respostaP1N = JOptionPane.showInputDialog("Teclea o nome da persoa");
        return nome;
    }

    public float Persoa1Peso(){
        String respostaP1P = JOptionPane.showInputDialog("Teclea o peso da persoa");
        return peso;
    }

    public String Persoa2Nome() {
        String respostaP2N = JOptionPane.showInputDialog("Teclea o nome da persoa");;
        return nome;
    }

    public float Persoa2Peso(){
        String respostaP2P = JOptionPane.showInputDialog("Teclea o peso da persoa");
        return peso;
    }

    public void Comparar() {

        String nome1 = Persoa1Nome();
        String nome2 = Persoa2Nome();

        float peso1 = Persoa1Peso();
        float peso2 = Persoa2Peso();

        float difPes1 = peso1-peso2;
        float difPes2 = peso2-peso1;

        if (peso1 > peso2) {
            JOptionPane.showMessageDialog(null, nome1+" pesa mais que" +nome2+" por unha diferencia de "+difPes1+ "Kg.");
        }
        else {
            JOptionPane.showMessageDialog(null, nome2+" pesa mais que "+nome1+" por unha diferencia de "+difPes2+" Kg.");
        }
    }
}


