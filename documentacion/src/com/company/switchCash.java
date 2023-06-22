package com.company;

public class switchCash {
    public static void main(String[] args) {
        String weather = "sunny";

        switch (weather) {

            case "sunny":
                System.out.println("El tiempo es Soleado");
            case "cloudy":
                System.out.println("El tiempo es Nublado");
            default:
                System.out.println("El tiempo no está definido");
                break;
        }
    }
}
