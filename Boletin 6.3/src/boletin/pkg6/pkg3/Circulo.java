/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg6.pkg3;

/**
 *
 * @author dam1
 */
public class Circulo {
    
    //atributos
    
    private double radio;
    private final double PI=3.14;
    
    //métodos
   
    //metodo sen parámetros
    
    public Circulo(){
    
    }
    
    //método con parámetros
    
    public Circulo(double radio, double PI){
        this.radio=radio;
    }
    
    //metodos de acceso
    
    public void setRadio(double Radio){
        
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setPI(double PI){
        
    }
    
    public double getPI(){
        return PI;
    }
    
    public double getcalcularArea(){
        return PI*Math.pow(radio, 2);
    }
    
    public double getcalcularLonxitude(){
        return PI*radio*2;
    }
}
