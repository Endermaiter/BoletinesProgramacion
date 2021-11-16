/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2.pkg3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca los euros: ");
        double euros=sc.nextDouble();
        System.out.println("Introduzca el valor actual del dolar en €: ");
        double cambio=sc.nextDouble();
        double dolares=euros*cambio;
        System.out.println(euros+" € son actualmente "+dolares+ " $");    
    }
    
}
