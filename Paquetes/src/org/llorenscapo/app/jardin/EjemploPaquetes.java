package org.llorenscapo.app.jardin;

/*import org.llorenscapo.app.hogar.Persona;
import org.llorenscapo.app.hogar.Gato;*/

import static org.llorenscapo.app.hogar.Color.*;
import static org.llorenscapo.app.hogar.Persona.*;
import org.llorenscapo.app.hogar.*;
import org.llorenscapo.app.hogar.Color;

import java.awt.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Llorenç");
        p.setApellido("Capó");
        //p.setColorPelo(Color.CAFE);
        p.setColorPelo(CAFE);
        System.out.println(p.getNombre());

        //Gato g = new Gato(); la clase Gato es default

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println(jugando);

        String saludo = Persona.saludar();
        String saludo2 = saludar();

        String generoMujer = Persona.GENERO_FEMENINO;
        String generoMujer2 = GENERO_FEMENINO;

    }
}
