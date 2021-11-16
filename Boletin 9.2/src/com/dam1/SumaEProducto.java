package com.dam1;

public class SumaEProducto {
    public void operar(){
        int acuSum=10;
        double acuProd=10;
        int i=0;
        int num=10;
        while(i<80){
            acuSum=acuSum+(++num);
            acuProd=acuProd*(++num);
            i++;
        }
        System.out.println("A suma dos numeros do 10 ao 90 e igual a "+acuSum);
        System.out.println("O producto dos numeros do 10 ao 90 e igual a "+acuProd);
    }
}
