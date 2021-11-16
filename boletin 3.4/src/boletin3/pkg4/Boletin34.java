/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3.pkg4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca os cartos totales:");
        int eurosTotales=sc.nextInt();
        int division1=eurosTotales/100;  
        int resto1=eurosTotales%100;     
        int division2=resto1/20;        
        int resto2=division2%20;          
        int division3=resto2/5;         
        int resto4=division3%1;
        System.out.println("Os cartos totales poden dividirse en: \n"+division1+" billetes de 100€ \n"+division2+" billetes de 20€ \n"+division3+" billetes de 5€ \n"+resto4+" monedas de 1€");
    }
    
}
