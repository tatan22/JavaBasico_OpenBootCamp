package com.company;

public class Funciones {
    public static void main(String[] args) {
        holaMundo();
        //holaMundo("Jhonatan");
        //holaMundo("Carlos ");
        //holaMundo("Roberto");
        String hola  = delvolverHola();
        System.out.println(hola);
    }
    public static void holaMundo() {
        System.out.println("Hola Mundo desde un metodo 1");
        System.out.println("Hola Mundo desde un metodo 2");
    }
    public static void holaMundo(String name) {
        System.out.println("Hola " + name);
    }

    private static String delvolverHola() {
        return "Devolver Texto";
    }
    private static int suma(int num1, int num2) {
        return num1 + num2;
    }
}
