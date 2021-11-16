/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg6;

/**
 *
 * @author dam1
 */
public class Coche {
    private int velocidade;
    
    public Coche(){
        velocidade=0;
        }
    
    //metodos
    public int getVelocidade(){ //devolve a velocidade actual
        return velocidade;
    }
    
    public void acelerar(int valor){ //incrementa a velocidade na cantidade valor
        velocidade=velocidade+valor;
        //velocidade+=valor
    }
    
    public void frenar(int menos){ //dimnue a velocidade na cantidade menos
        
    }
}
