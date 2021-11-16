package com.dam1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	int i=0;
    int a=0;
        while (i<5){
            String resposta = JOptionPane.showInputDialog("Introduzca o numermo:");
            int numero = Integer.parseInt(resposta);
            a+=numero;
            i++;
            System.out.println(a);
        }
        System.out.println(a);
    }
}
