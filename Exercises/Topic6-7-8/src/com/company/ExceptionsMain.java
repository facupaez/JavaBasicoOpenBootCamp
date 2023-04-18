package com.company;

/**
 * @author Facu Paez
 * 7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
 * ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
 * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
 * Finalmente, mostraremos en cualquier caso: "Demo de código".
 * @version 1.0
 */
public class ExceptionsMain {

    public static void main(String[] args) {

        dividePorCero(2);
    }

    private static int dividePorCero(int num) {
        try {
            num = num / 0;
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse " + e.getMessage());
        } finally {
            System.out.println("Demo de código");
        }

        return num;
    }
}
