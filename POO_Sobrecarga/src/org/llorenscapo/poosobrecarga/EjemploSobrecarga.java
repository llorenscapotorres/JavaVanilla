package org.llorenscapo.poosobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        System.out.println("sumar int: " + cal.sumar(10, 5));
        System.out.println("sumar float: " + cal.sumar(5.2F, 3.4F));
        System.out.println("sumar 4 enteros: " + cal.sumar(1,2,3,4));
        System.out.println("sumar float + n int: " + cal.sumar(3.2f, 2, 4));

    }
}
