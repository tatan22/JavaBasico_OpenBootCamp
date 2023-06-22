package com.company;

public class ifElse {
    public static void main(String[] args) {
        boolean check = 5 < 10;
        int num1 = 5;
        int num2 = 10;
        int num3 = 20;
        int num4 = 30;

        if (check)
            System.out.println("Verdadero1");

        if (5 > 10)
            System.out.println("Verdadero2");
        else if(num3 < num4)
            System.out.println("Falso no se cumple");

        if (num1 < num2)
            System.out.println("Verdadero3");

        if (num1 < num2 && num2 < num3) {
            System.out.println("Verdadero4");
            System.out.println("Varias lineas lleva {}");
        }

    }
}
