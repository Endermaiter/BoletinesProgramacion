/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3.pkg2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la temperatura en grados celsius:");
        double tempGrados=sc.nextDouble();
        System.out.println(tempGrados+" ºC son "+(tempGrados+273)+" ºK");
        System.out.println(tempGrados+" ºC son "+(tempGrados*1.8+32)+" ºF");
    }
    
}
