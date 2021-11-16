/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5;

/**
 *
 * @author dam1
 */
public class Coche {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    //constructores
    
    public Coche(){
    
    }

    public Coche(float km, float litros, float vMed, float pGas){
    this.km = km;              //kilometros recorridos
    this.litros = litros;      //litros
    this.vMed = vMed;          //velocidade media
    this.pGas = pGas;          //precio da Gasolina
    }
    
    //metodos de acceso
    //necesario
    public void setKm(float km){
        
    }
    
    public double getKm(){
        return km;
    }
    //necesario
    public void setLitros(float Litros){
        
    }
    
    public double getLitros(){
        return litros;
    }
   //necesario
    public void setVMed(float vMed){
        
    }
    
    public float getVMed(){
        return vMed;
    }
    
    //necesario
    public void setpGas(double pGas){
        
    }
    
    public float getpGas(){
        return pGas;
    }   
    //necesario
    public float getTempo(){
        return km/vMed;
    }
    //necesario
    public float getConsumoMedio(){
        return litros*100/km;
    }
    
    public float getconsumoEuros(){
        return pGas*getConsumoMedio();
    }
    
    //amosar
    
    public void amosar1(){
    System.out.println("O consumo medio é de: "+getConsumoMedio()+" L/Km");
    }
    
    public void amosar2(){
    System.out.println("A velocidade media é de: "+vMed+"Km/h");
    }

}
