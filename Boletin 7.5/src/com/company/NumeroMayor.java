package com.company;

import javax.swing.JOptionPane;

public class NumeroMayor {
    public void esMaior() {
        int num1 = lerNumero();
        int num2 = lerNumero();
        int num3 = lerNumero();

        if (num1 > num2 | num1 > num3) {
            System.out.println(num1 + "es mayor");
        } else if (num2 > num1 | num2 > num3) {
            System.out.println(num2 + "es mayor");
        } else if (num3 > num1 | num3 > num2) {
            System.out.println(num3 + "es maior");
        }
        System.out.println("FIN");
    }

    public int lerNumero() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero enteiro: "));
        return num;

    }
}

