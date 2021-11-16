package com.dam1;

import javax.swing.*;

public class PosNegNull {

    public void contar(){
        int i=0;
        int positivo=0;
        int negativo=0;
        int nulo=0;
            for(i=0;i<10;i++){
                String resposta = JOptionPane.showInputDialog("Introduzca o número:");
                int numero = Integer.parseInt(resposta);
                if(numero>0){
                    positivo++;
                }
                else if(numero<0){
                    negativo++;
                }
                else{
                    nulo++;
                }
            }
            JOptionPane.showMessageDialog(null, "Hai "+positivo+" numero(s) positivo(s)");
            JOptionPane.showMessageDialog(null, "Hai "+negativo+" numero(s) negativo(s)");
            JOptionPane.showMessageDialog(null, "Hai "+nulo+" numero(s) igual(es) a 0");
    }
}
