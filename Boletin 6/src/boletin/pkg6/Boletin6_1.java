package boletin.pkg6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletin6_1 {
    
    public static void main(String[] args){
    
    int valor;
    int menos;
    
    Scanner escaner=new Scanner(System.in);
    
    Coche coche = new Coche();
    System.out.println("La velocidad actual del coche es "+coche.getVelocidade()+"Km/h");
    
    System.out.println("Introduzca la velocidad a acelerar en Km/h ");
    valor=escaner.nextInt();
    
    coche.acelerar(valor);
    System.out.println("La velocidad actual del coche es "+coche.getVelocidade()+"Km/h");
    
    System.out.println("Introduzca la velocidad a acelerar en Km/h ");
    menos=escaner.nextInt();
    
    coche.frenar(menos);
    System.out.println("La velocidad actual del coche es "+coche.getVelocidade()+"Km/h");

    }
}
