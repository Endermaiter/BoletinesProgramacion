package com.dam1;

import javax.swing.*;

public class Xogo {
    public void Adiviñar(){
        double numAd = (int)(Math.random()*50); //numero random dado por la maquina
        int numProp=0;                   //inicializo en 0 o numProp
        while(numAd!=numProp){

            numProp = Integer.parseInt(JOptionPane.showInputDialog("¿Que número cree que é? (1-50)")); //numero proporcionado al ordenador
            int diferencia = (int) Math.abs(numAd-numProp); //diferencia= valor absoluto de <numAd-numProp>
            if(diferencia>20) {
                JOptionPane.showMessageDialog(null, "Moi lonxe");
            }
            else if(diferencia>=10){
                JOptionPane.showMessageDialog(null, "Lonxe");
            }
            else if(diferencia>5){
                JOptionPane.showMessageDialog(null, "Preto");
            }
            else{
                JOptionPane.showMessageDialog(null, "Moi Preto");
            }
        }
        if(numAd == numProp){
            JOptionPane.showMessageDialog(null, "Numero Adiviñado!!!");
        }

    }
}
