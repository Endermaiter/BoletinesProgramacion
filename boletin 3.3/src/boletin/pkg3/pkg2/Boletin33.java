/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg3.pkg2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la cantidad de billetes de 100€ que tiene:");
        int billetes100=sc.nextInt();
        System.out.println("Introduzca la cantidad de billetes de 20€ que tiene:");
        int billetes20=sc.nextInt();
        System.out.println("Introduzca la cantidad de billetes de 5€ que tiene:");
        int billetes5=sc.nextInt();
        System.out.println("Introduzca la cantidad de monedas de 1€ que tiene:");
        int monedas1=sc.nextInt();
        System.out.println("O equivalente en euros é :"+billetes100*100+billetes20*20+billetes5*5+monedas1+" €");
    }
    
}
