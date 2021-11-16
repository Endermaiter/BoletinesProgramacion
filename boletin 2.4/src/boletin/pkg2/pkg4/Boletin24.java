/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2.pkg4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Introduzca el primer número: ");
        double x=sc.nextDouble();
            System.out.println("Introduzca el segundo número: ");
        double y=sc.nextDouble();  
        double suma=x+y;
        double resta=x-y;
        double producto=x*y;
        double cociente=x/y;
            System.out.println(x+" + "+y+" = "+suma);
            System.out.println(x+" - "+y+" = "+resta);
            System.out.println(x+" * "+y+" = "+producto);
            System.out.println(x+" / "+y+" = "+cociente);
            
    }
    
}
