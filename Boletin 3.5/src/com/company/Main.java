package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double soldoFixo,importeVentas,km;
        final double comision=0.05;
        final int eurosKm=2;
        final int eurosDia=30;
        int diasFuera;
        final double IRPF=0.18;
        final int retencion=36;

        Scanner esc = new Scanner(System.in);
        System.out.println("Inserte el salario fijo: ");
        soldoFixo=esc.nextDouble();
        System.out.println("Inserte el importe total de las ventas :");
        importeVentas=esc.nextDouble();
        System.out.println("Inserte los km viajados: ");
        km=esc.nextDouble();
        System.out.println("Inserte los dias totales en viaje de negocios: ");
        diasFuera=esc.nextInt();
        double salarioBruto =soldoFixo+importeVentas*comision+km*eurosKm+diasFuera*eurosDia;
        double salarioLiquido=salarioBruto*(1-IRPF)-retencion;
        salarioBruto = Math.round(salarioBruto*100.0)/100.0;
        salarioLiquido =Math.round(salarioLiquido*100.0)/100.0;


        System.out.println("Salario Bruto= " +salarioBruto + "\n el Salario Liquido= "+salarioLiquido);
    }
}
