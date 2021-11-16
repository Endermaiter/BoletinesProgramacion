/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2.pkg5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int METROSMILLAS=1852;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca las millas: ");
        double millas=sc.nextDouble();
        System.out.println(millas+"mill son "+millas*METROSMILLAS+"m.");
    }
    
}
