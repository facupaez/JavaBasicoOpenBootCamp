package com.company.extractmethod.bad;

public class Main {

    void printHTML() {
        printHead();
        printBody();
        System.out.println("This is the footer");
        System.out.println("script");
        System.out.println("copyright");

    }

    private void printBody() {
        System.out.println("This is the body");
    }

    private void printHead() {
        System.out.println("This is the head");
    }
}
