/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg2;

import javax.swing.*;

/**
 *
 * @author dam1
 */
public class SumayResta {
   
    public short solicitarNumero(){
        String resposta = JOptionPane.showInputDialog("Teclea un numero");
        short num = Short.parseShort(resposta);
        return num;
    }
    
    public void SumayResta(){
        short num1 = solicitarNumero();
        short num2 = solicitarNumero();
        if((num1>num2 | num1==num2)){
            System.out.println("A suma dos dous numeros é "+(num1+num2));
        } 
        else{
            System.out.println("A suma dos dous numeros é "+(num1+num2));  
            System.out.println("A resta dos dous numeros é "+(num1-num2));
        }  
  }    
}
