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
public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    //constructores
    
    public Libro(){
        
    }
    
    public Libro(String titulo, String autor, int ano, short numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
    }
   
    //metodos de acceso
    
    public void setTitulo(String Titulo){
    
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAutor(String Autor){
    
    }
    public String getAutor(){
        return autor;
    }
    public void setAno(int Ano){
    
    }
    public int getAno(){
        return ano;
    }
    public void setNumPaginas(short numPaginas){
    
    }
    public short getNumPaginas(){
        return numPaginas;
    }
    public void setValoracion(float Valoracion){
    
    }
    public float getValoracion(){
        return valoracion;
    }
    
    public void amosar(){
    System.out.println("Titulo: "+titulo+"\n Autor: "+autor+"\n Ano: "+ano+"\n NumPaginas: "+numPaginas+"\n Valoracion: "+valoracion);
    }
    
    public void amosar1(){
    System.out.println("Titulo: "+titulo+"\n Autor: "+autor+"\n Ano: "+ano+"\n NumPaginas: "+numPaginas+"\n Valoracion: "+valoracion);
    }
}
