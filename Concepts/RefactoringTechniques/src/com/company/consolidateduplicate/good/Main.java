package com.company.consolidateduplicate.good;

public class Main {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary() {
        double result = 0;
        if (!isLegibleExtraSalary()) {
            result = 500;
        } else {
            result = 0;
        }

        sendMessage(); // ahora el metodo no se repite
        return result;
    }

    private void sendMessage() {
        // send email
        // connect smtp
        System.out.println("Sending message");
    }

    private boolean isLegibleExtraSalary() {
        boolean estudios = seniority < 1 || education < 1;
        boolean experiencia = incidents > 10 || !certification;
        return estudios || experiencia;
    }
}
