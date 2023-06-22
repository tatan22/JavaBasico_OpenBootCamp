package com.company;

public class whileLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            count++; // condicion
            if (count == 6)
                break; // rompe el flujo de ejecucion, termina el bucle.
                //continue; // salta el valor 6 y continua con la siguiente iteracion
            System.out.println(count + 1 + " hola mundo");
        }
        System.out.println("Fin");
    }
}
