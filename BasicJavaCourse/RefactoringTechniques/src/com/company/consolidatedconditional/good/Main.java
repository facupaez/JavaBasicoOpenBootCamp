package com.company.consolidatedconditional.good;

public class Main {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary() {

        double result = 0;
        if(!isLegibleExtraSalary()){
            return result;
        }

        //calculate extra salary
        result += 5;

        return result;
    }

    private boolean isLegibleExtraSalary(){
        boolean estudios = seniority < 1 || education < 1;
        boolean experiencia = incidents > 10 || !certification;
        return estudios || experiencia;
    }

    }
