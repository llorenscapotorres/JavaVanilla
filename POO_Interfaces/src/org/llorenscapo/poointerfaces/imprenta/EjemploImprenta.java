package org.llorenscapo.poointerfaces.imprenta;

import org.llorenscapo.poointerfaces.imprenta.modelo.*;
import static org.llorenscapo.poointerfaces.imprenta.modelo.Imprimible.imprimir;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("John", "Doe"), "Ingeniero de sistemas", "Resumen laboral...");
        cv.addExperiencia("Java")
            .addExperiencia("Oracle DBA")
            .addExperiencia("Spring Framework")
            .addExperiencia("Desarrollador Fullstack")
            .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseños: Elem. Reusables POO",
                Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"),
                new Persona("James", "Gosling"), "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir(){
                return "Imprimiendo un objeto genérico de una clase anónima";
            }
        });

    }
}
