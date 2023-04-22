package com.company;

import java.util.ArrayList;

/**
 * @author Facu Paez
 * Aplicando patron observer de Java
 * En el cual un emisor "observer" emite un evento y muchos receptores reciben el envento
 * Relacion OneToMany
 * @version 1.0
 */

interface Mensajero {
    void Saludando();
}

class ReceptorBienvenida implements Mensajero {
    @Override
    public void Saludando() {
        System.out.println("Hola, buen día!");
    }
}

class ReceptorDespedida implements Mensajero {
    @Override
    public void Saludando() {
        System.out.println("Hasta luego, nos vemos pronto!");
    }
}

class Emisor {
    // creando lista de receptores
    private ArrayList<Mensajero> receptores = new ArrayList<Mensajero>();

    public void meteReceptor(Mensajero receptor) {
        receptores.add(receptor);
    }

    // iterando y llamando metodo en cada receptor
    public void saluda() {
        for (Mensajero ml : receptores) {
            ml.Saludando();
        }
    }
}

public class Main {

    public static void main(String[] args) {

        // creamos objeto emisor "observer"
        Emisor emisor = new Emisor();

        // creamos receptores bienvenida
        ReceptorBienvenida receptorBienvenida = new ReceptorBienvenida();
        ReceptorBienvenida receptorBienvenida2 = new ReceptorBienvenida();
        // creamos receptores despedida
        ReceptorDespedida receptorDespedida = new ReceptorDespedida();
        ReceptorDespedida receptorDespedida2 = new ReceptorDespedida();

        emisor.meteReceptor(receptorBienvenida);
        emisor.meteReceptor(receptorBienvenida2);
        emisor.meteReceptor(receptorDespedida);
        emisor.meteReceptor(receptorDespedida2);

        // al llamar al metodo saluda del emisor, automaticamente emite el mensaje a todos los receptores
        // este patron puede utilizarse por ejemplo al registrar una cuenta y enviar automaticamente un correo electronico
        emisor.saluda();
    }
}
