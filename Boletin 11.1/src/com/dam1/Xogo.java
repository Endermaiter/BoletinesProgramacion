package com.dam1;

import javax.swing.*;

public class Xogo {

    public void adiviñar(){
        int i = 0;
        String texto1 = JOptionPane.showInputDialog("Introduzca el numero que desea adivinar");
        int numAd = Integer.parseInt(texto1);

        String texto2 = JOptionPane.showInputDialog("Introduzca el numero de intentos posibles");
        int intentos = Integer.parseInt(texto2);

        while(i<intentos){
            String texto3 = JOptionPane.showInputDialog("¿Que número cree que é? (1-50)");
            int numProp = Integer.parseInt(texto3);
            if(numProp==numAd){
                JOptionPane.showMessageDialog(null, "Número Adviñado!!!");
                break;
            }
            else if(numProp>numAd){
                JOptionPane.showMessageDialog(null, "É menor");
            }
            else{
                JOptionPane.showMessageDialog(null, "É maior");
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "GAME OVER");
    }
}
