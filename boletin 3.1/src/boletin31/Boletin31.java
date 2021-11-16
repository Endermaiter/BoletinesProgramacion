/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el precio original del producto");
        double prezoTarifa=sc.nextDouble();
        System.out.println("Introduca el precio que ha pagado por el producto");
        double prezoPagado=sc.nextDouble();
        System.out.println("El porcentaje descontado es "+prezoPagado*100/prezoTarifa+" %");
    }
    
}
