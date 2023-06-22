package com.example;

public class CocheMain {
    public static void main(String[] args) {

        String coche = "alfa rimeo";
        Coche cocheObj = new CocheHibrido();

        Coche cocheObj2 = new CocheElectrico("rojo", "Mazda", "Mazda 6",1430.0,5.0,"motor_electrico");
        cocheObj2.acelerar(50);

        cocheObj2.peso = 1350.8;

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo de motos";
        cocheElectrico.color = "Verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "Civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("Azul","Alfa","Mazda 5",1435.7,5.4,"TXZ");

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);

        System.out.println(cocheElectrico2);

    }


}
