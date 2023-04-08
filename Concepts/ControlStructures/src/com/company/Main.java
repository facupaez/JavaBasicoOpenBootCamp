package com.company;

public class Main {

    public static void main(String[] args) {

        boolean check = 5 < 10;
        int num1 = 50;
        int num2 = 10;
        int num3 = 20;

        // estructura if
        if (check) {
            System.out.println("Es verdadero");
        }

        // estructura if..else
        if (num1 < num2 && num2 < num3) {
            System.out.println("Es verdadero");
        } else {
            System.out.println("Es falso");
        }

        // estructura if...else if

        String dia = "Martes";

        if (dia.equals("Lunes")) {
            System.out.println("Hoy es lunes usando if...else if!");
        } else if (dia.equals("Martes")) {
            System.out.println("Hoy es martes if...else if!");
        } else if (dia.equals("Domingo")) {
            System.out.println("Hoy es domingo if...else if!");
        } else {
            System.out.println("Ingrese un día");
        }

        // estructura switch

        String estacion = "Verano";

        switch (estacion) {
            case "Verano":
                System.out.println("La estación es verano usando switch!");
                break;
            case "Otonio":
                System.out.println("La estación es otoñoo usando switch!");
                break;
            case "Invierno":
                System.out.println("La estación es invierno usando switch!");
                break;
            case "Primavera":
                System.out.println("La estación es primavera usando switch!");
                break;
            default:
                System.out.println("Ingrese una estación");
        }
    }
}
