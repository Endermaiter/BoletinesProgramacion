/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner sc=new Scanner(System.in);
       float km=sc.nextFloat();
       float litros=sc.nextFloat();
       float vMed=sc.nextFloat();
       float pGas=sc.nextFloat();
        
       Coche obxCon1 = new Coche();
       obxCon1.amosar1();
       obxCon1.setLitros(50);
       obxCon1.setpGas(1.57);
       
       Coche obxCon2 = new Coche(km, litros, vMed, pGas);
       obxCon2.amosar2();
       

       
       
              
       
       
      
    }
    
}
