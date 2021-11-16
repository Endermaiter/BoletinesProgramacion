/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg4;

/**
 *
 * @author dam1
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro obxLib1 = new Libro();
        obxLib1.amosar();
        Libro obxLib2 = new Libro("Titulo","Autor",2021,(short)450);
        obxLib2.amosar1();
    }
    
}
