package org.llorenscapo.main;

import org.llorenscapo.empresa.*;

public class EjemploMain {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Jordi", "Capó", "5555-5",
                "Águila, 32", 4000);
        gerente.setPresupuesto(100000);

        gerente.aumentarRemuneracion(50);

        System.out.println(gerente);

        Cliente cliente1 = new Cliente("Angel", "Salord", "1234-7",
                "C.PoGorda, 33");

        Cliente cliente2 = new Cliente("Francesc", "Castell", "2222-5",
                "C.PingPong, 1");

        Empleado empleado1 = new Empleado("Llorenç", "Capó", "5555-4",
                "C.Aragó, 32", 1400);

        Empleado empleado2 = new Empleado("Jordi", "Capó", "5189-4",
                "C.Valencia, 14", 1780);

        empleado2.aumentarRemuneracion(15);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(empleado1);
        System.out.println(empleado2);

    }
}
