package org.llorenscapo.app.jardin;

import org.llorenscapo.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    //un atributo => protected: se puede utilizar en el mismo package o en la clase herencia hija

    String jugar(Persona persona){
        return persona.lanzarPelota();
    } //función default, solo sirve en su package

}
