package com.company;

public class Main {

    public static void main(String[] args) {

        boolean check = 5 < 10;
        int num1 = 50;
        int num2 = 10;
        int num3 = 20;

        // estructura if
        if(check){
            System.out.println("Es verdadero");
        }

        // estructura if..else
        if(num1 < num2 && num2 < num3){
            System.out.println("Es verdadero");
        }else{
            System.out.println("Es falso");
        }
    }
}
