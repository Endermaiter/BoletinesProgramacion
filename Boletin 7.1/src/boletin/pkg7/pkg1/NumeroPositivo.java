/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class NumeroPositivo {
    
    public float pedirNumero(){
        String resposta = JOptionPane.showInputDialog("Teclea un numero");
        float num = Float.parseFloat(resposta);
        return num;
    }
    
    public void NumeroPositivo(){
    float num = pedirNumero();
    if(num>0){
        System.out.println(num+" é positivo.");
    }
}
}
