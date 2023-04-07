package com.company;

public class NameFormatException extends Exception {

    private static final long serialVersionUID = 1L;

    //constuructor que recibe el mensaje del error que nosotros hemos creado
    public NameFormatException(String errorMessage) {
        super(errorMessage);
    }
}
