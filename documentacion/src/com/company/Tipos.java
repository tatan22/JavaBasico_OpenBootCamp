package com.company;

public class Tipos {
    public static void main(String[] args) {
        /*
           Primera forma:
               Tipo + Identificador = asignacionDeValor
               ejemplo:
               int numero = 30;

           Segunda forma:
            tipo + identificador;
            identificador= asignacionDeValor
         */
        //----------------------------- Tipo de datos primitivo " No Pueden ser nulos" --------------------------
        // Enteros
        byte    numero1 = 1; // 1 byte
        short   numero2 = 2; // 2 byte
        int     numero3 = 3; // 4 bytes
        long    numero4 = 3l; // 8 bytes

        // Punto flotante
        float   decimal1 = 4.9f;
        double  decimal2 = 9.99d;

        // Caracter
        char    caracter1 = 'a';

        // booleanos
        boolean verdadero = true;
        boolean falso = false;

        //------------------------------- Los String si Pueden ser nulos

        // cadena de texto
        String nombre   = "Jhonatan Cardona";
        String apellido = "Cardona";

        //-------------------------------

        // tipos envoltorio. Nos permiten envolver los tipos primitivos y asignarles null
        Integer numero = null;
        Long numero22 = 2L;
    }
}
